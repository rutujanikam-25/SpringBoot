package com.cyber.success.CSJ33SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyber.success.CSJ33SpringBootProject.dao.AdminDao;
import com.cyber.success.CSJ33SpringBootProject.model.User;

@Controller
@SessionAttributes("userKey")
public class LoginController {
	@Autowired
	private AdminDao dao;
	@RequestMapping("/adminTaskPage")
	public String reOpenHomePage()
	{
		return "adminTaskPage";
	}
	
	@RequestMapping("/")
	public String  openLoginPage()
	{
		return "login";
		
	}
	@RequestMapping("/openReg")
	public String openSignUp()
	{
		return "reg";
	}

	@RequestMapping(path="/doLogin",method=RequestMethod.POST)
	public String getLogin(@RequestParam("t1") String userName,@RequestParam("t2") String password,Model model)
	{
		User userLogin=dao.getLogin(userName, password);
		model.addAttribute("userKey",userLogin);
		String userType =userLogin.getUserType();
		if(userType.equalsIgnoreCase("ADMIN"))
		{
			return "adminTaskPage";
		}
		return "StudentTaskPage";
	}
}
