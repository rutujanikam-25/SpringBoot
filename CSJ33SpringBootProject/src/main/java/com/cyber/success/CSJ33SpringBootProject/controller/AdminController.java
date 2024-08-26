package com.cyber.success.CSJ33SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyber.success.CSJ33SpringBootProject.dao.AdminDao;
import com.cyber.success.CSJ33SpringBootProject.model.Admin;

@Controller
public class AdminController {
	@Autowired
	private AdminDao dao;
	
	@RequestMapping("/signup")
	@ResponseBody
	public String signUp(@ModelAttribute Admin admin, Model model)
	{
	Admin adminObj=dao.addAdmin(admin);
	if(adminObj!=null)
	{
		model.addAttribute("adminKey",adminObj);
		return "<h2><font color='green'>Registration Completed Successfully</font></h2><br>"
				+"<a href='/'>LoginForm here</a>";
		
	}
	else
	{
		return "<h2><font color='red'>Not able to register</font></h2>";
	}
	
	}

}
