package com.senderUserManagement.login;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senderUserManagement.model.Users;


@RestController
public class LoginController {

	@Autowired
	LoginService usersService;
	
	
	@RequestMapping("/senderUserManagement/login/all")
	public List<Users> getUserService(){
		return usersService.getUsers();
	}
	
	
	 @RequestMapping(method=RequestMethod.POST,value="/login")
	 public String setUsersObj(@RequestBody Users users) {
		 return usersService.setUsersObj(users);
	 }
	 
	
}
