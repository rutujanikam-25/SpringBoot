package com.cyber.success.CSJ33SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.cyber.success.CSJ33SpringBootProject.dao.CourseDao;
import com.cyber.success.CSJ33SpringBootProject.model.Course;

@Controller
public class StudentController {
     @Autowired
     private CourseDao dao;
	
	@RequestMapping(path="/viewCourseByStudent")
	public String viewAllCourse() {
		return "viewStudentCourse";
		
	}
	
	@RequestMapping("/viewCourseByStudent1")
	public String viewCourseWithSubject(Model model) {
	     	List<Course> list=dao.fetchAllCourse();
	     	model.addAttribute("viewKey",list);
	     	return "studentCourseView";
	}
}
