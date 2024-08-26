package com.cyber.success.CSJ33SpringBootProject.controller;



import java.time.LocalDate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyber.success.CSJ33SpringBootProject.model.Bill;
import com.cyber.success.CSJ33SpringBootProject.model.Course;
import com.cyber.success.CSJ33SpringBootProject.model.User;
import com.cyber.success.CSJ33SpringBootProject.repository.BillRepository;


@Controller
public class BillController {
	
	
	@Autowired
	private BillRepository repos;
	
	
	@RequestMapping("/generateBill")
	public  String getBill(Model model, HttpServletRequest request)
	{
		HttpSession session=request.getSession(false);
		Course c=(Course)session.getAttribute("bookingCourse");
		User user=(User)session.getAttribute("userKey");
		Bill b=new Bill();
		b.setBillAmount(c.getCoursePrice());
		b.setBillDate(LocalDate.now());
		b.setUserName(user.getUserName());
		Bill savedBill=repos.save(b);
		model.addAttribute("billKey",savedBill);
		return "invoice";
	
	}
	

}