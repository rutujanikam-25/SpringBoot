package com.cyber.success.CSJ33SpringBootProject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cyber.success.CSJ33SpringBootProject.model.Admin;
import com.cyber.success.CSJ33SpringBootProject.model.User;
import com.cyber.success.CSJ33SpringBootProject.repository.AdminRepository;
import com.cyber.success.CSJ33SpringBootProject.repository.UserRepository;
import com.cyber.success.CSJ33SpringBootProject.service.UserInterface;

@Service
public class AdminDao implements UserInterface {

	
	@Autowired
	private AdminRepository repos;
	@Autowired
	//private UserRepository userRepos;
    private UserRepository userRepos;
	@Override
	public Admin addAdmin(Admin admin) {
		Admin obj=repos.save(admin);
		return obj;
	}

	@Override
	public User getLogin(String userName, String password) {
		User userObj=userRepos.getLogin(userName,password);
		if(userObj!=null)
		{
			return userObj;
		}
		return null;
	}

	

	

}
