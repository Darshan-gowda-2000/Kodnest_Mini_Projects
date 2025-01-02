package com.kodbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodbook.models.User;
import com.kodbook.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	@PostMapping("/signUp")
	public String addUser(User user) {
		String username=user.getUsername();
		String email=user.getEmail();
		boolean status=service.userExists(username,email);
		if(status==false) {
			service.addUser(user);
		}
		return "index";
	}
}
