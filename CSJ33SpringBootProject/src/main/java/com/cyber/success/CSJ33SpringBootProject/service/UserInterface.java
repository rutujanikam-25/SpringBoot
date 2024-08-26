package com.cyber.success.CSJ33SpringBootProject.service;

import com.cyber.success.CSJ33SpringBootProject.model.Admin;
import com.cyber.success.CSJ33SpringBootProject.model.User;

public interface UserInterface {
	public Admin addAdmin(Admin admin);
	public User getLogin(String userName,String password);
}
