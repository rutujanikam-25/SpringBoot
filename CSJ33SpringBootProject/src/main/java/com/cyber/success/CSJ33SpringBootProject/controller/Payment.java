package com.cyber.success.CSJ33SpringBootProject.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyber.success.CSJ33SpringBootProject.dao.BookingDao;
import com.cyber.success.CSJ33SpringBootProject.dao.CourseDao;
import com.cyber.success.CSJ33SpringBootProject.model.Book;
import com.cyber.success.CSJ33SpringBootProject.model.Course;
import com.cyber.success.CSJ33SpringBootProject.model.User;

@Controller
@SessionAttributes("bookingCourse")
public class Payment {
  @Autowired
	 private CourseDao dao;
  
  @Autowired 
  BookingDao bookDao;
	
	 @RequestMapping("/bookCourse/{cid}")
	   public String makePayment(@PathVariable long cid,Model model) {
		 Course obj=dao.getCourseById(cid);
		 model.addAttribute("bookingCourse",obj);
		 return "Payment";
		 
	 }
	 
	 @RequestMapping("/SpringBoot/paymentOption")
	
	 public String getPaymentOption(@RequestParam("r1")String optionType) {
		 
		 if(optionType.equalsIgnoreCase("UPI")) {
			 return "UPI";
		 }else if(optionType.equalsIgnoreCase("credit card")) {
			 return "credit card";
		 }else if(optionType.equalsIgnoreCase("debit")) {
			 return "debit";
		 }else if(optionType.equalsIgnoreCase("cash")) {
			 return "cash";
		 }else {
			 return "error";
		 }
		 
		 
	 }
	 
	 @RequestMapping(path="/upiPay",method=RequestMethod.POST)
	 public String upiCheck(@RequestParam("upiId")String id,Model model) {
		 model.addAttribute("idKey",id);
		 return "UpiChecker";
				 }
	 
	 @RequestMapping(path="/startPayment",method=RequestMethod.POST)
	 public String stepToPayment() {
		  return "pinCodeChecker";
	 }
	 @RequestMapping(path="/gopinStorage",method=RequestMethod.POST)
	 //@ResponseBody
	 public String stepToFinalPayment(@RequestParam("p1")String param,Model model ,HttpServletRequest request) {
		 
		 List<String> pincodes=new ArrayList();
		 pincodes.add("11111");
		 pincodes.add("22222");
		 pincodes.add("12345");
		 pincodes.add("77777");
		 pincodes.add("44444");
		 
		int f=0;
		for(String p:pincodes) {
			if(param.equals(p)) {
				f=1;
				break;
			}
		}
		
		if(f==1) {
			Book bookdetails= new Book();
			HttpSession session=request.getSession();
			Course c=(Course)session.getAttribute("bookingCourse");
			String courseName=c.getCourseName();
			String[] courseNames=courseName.split(" ");
			String newCourseName="CS".concat(courseNames[0]).concat(String.valueOf(c.getCourseId()));
			bookdetails.setBatchName(newCourseName);
			bookdetails.setPaymentStatus("paid");
			bookdetails.setBookingDate(LocalDate.now());
			User userObj=(User) session.getAttribute("userKey");
			bookdetails.setUserName(userObj.getUserName());
			bookdetails.setCourseId(c.getCourseId());
			
			Book newBookingDetails=bookDao.addBook(bookdetails);
			model.addAttribute("bookKey" ,bookdetails);			
			return "PaymentSuccess";
		}
		return "Error";
	 }
}
