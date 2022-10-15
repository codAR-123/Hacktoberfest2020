package com.examly.springapp.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.examly.springapp.model.User;
import com.examly.springapp.service.UserService;



@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

	public UserController() {
	super();
}

	public UserController(UserService userService) {
	super();
	this.userService = userService;
	}

	@PostMapping("Register/addUsers")	 
	public String addUser(@RequestBody User user)
	{
		userService.saveAll(user);
		return "New user is added";
	}
}
