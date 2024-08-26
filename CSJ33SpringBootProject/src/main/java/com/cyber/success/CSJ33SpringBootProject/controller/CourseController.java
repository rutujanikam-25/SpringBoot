package com.cyber.success.CSJ33SpringBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyber.success.CSJ33SpringBootProject.dao.CourseDao;
import com.cyber.success.CSJ33SpringBootProject.model.Course;
@Controller
public class CourseController {
	@Autowired
	private CourseDao dao;
	
	@RequestMapping("/addCourse")
	public String openCoursePage()
	{
		return "addCourse";
	}
	@RequestMapping(path="/addMyCourses",method=RequestMethod.POST)
	@ResponseBody
	public String addCourseToDB(@ModelAttribute Course course,Model model)
	{
		Course cObj=dao.addCourse(course);
		model.addAttribute("courseInfo" ,cObj);
		
		System.out.println(cObj);
		if(cObj!=null)
		{
			return "<h2><font color='green'> Course Added Successfully</font></h2><br>" + "<a href='adminTaskPage'>Go to home page</a>";
		}
		return "<h2><font color='red'>Error while saving the Course</font></h2>";
	}
	@RequestMapping("/viewCourse")
	public String viewAllCourse(Model model)
	{
		List<Course> list=dao.fetchAllCourses();
		model.addAttribute("courseList",list);
		
		return "viewAllCourses";
	}
	
	//url localhost:8816/EditCourse/53
	@RequestMapping("/EditCourse/{cid}")
	public String editCourse(@PathVariable long cid,Model model) {
		
		Course obj=dao.getCourseById(cid);
		model.addAttribute("courseKey",obj);
		return "editPage";
		
	}
	
	@RequestMapping(path="/SpringBoot/UpdateCourse",method=RequestMethod.POST)
	@ResponseBody
	public String updateMyCourse(@RequestParam("t1") long courseId,
			                      @RequestParam("t2") String courseName,
			                      @RequestParam("t3") double price
			                      
                                   ) {
		Course c=new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(price);
		
		int courseUpdateStatus=dao.update(c);
		if(courseUpdateStatus>0) {
			return"<h2><font color='green'>Course Update Successfully</font></h2>";
		}
		return"<h2><font color='red'>Not able to update</font></h2>";
									}
		
	@RequestMapping(path="/deleteCourse/{cid}")
	@ResponseBody
	public String deleteCourse(@PathVariable long cid) {
		Course c=new Course();
		c.setCourseId(cid);
		int courseDelete=dao.deleteCourse(cid);
		if(courseDelete>0) {
			return"<h2><font color='green'>Course delete Successfully</font></h2>";
		}
		return"<h2><font color='red'>Not able to delete</font></h2>";
	}
	
	
	
	
	
	
	
	
	
	
	
}
