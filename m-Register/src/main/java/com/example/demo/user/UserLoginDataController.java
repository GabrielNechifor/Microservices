package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginDataController 
{
	@Autowired
	private UserLoginDataService userLoginDataService;
	
	
	@PostMapping("/registerUser")
	public void registerUser(@RequestBody UserLoginData user)
	{
		userLoginDataService.addUser(user);
	}
}
