package com.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.User;
import com.poc.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
		
	}
	
	
	@GetMapping("/getAllUsers")
	
	public List<User> getAllUser(){
		
		return userService.getAllUser();
	}
			

}
