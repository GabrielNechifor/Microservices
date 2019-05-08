package com.senderUserManagement.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senderUserManagement.model.Profiles;
import com.senderUserManagement.model.RegisterDetails;
import com.senderUserManagement.model.Users;


@RestController
public class RegisterController 
{
	@Autowired
	private RegisterService userLoginDataService;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody RegisterDetails user)
	{
		return userLoginDataService.addUser(user);
	}
}
