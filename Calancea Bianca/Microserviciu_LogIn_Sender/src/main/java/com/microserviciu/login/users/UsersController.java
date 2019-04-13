package com.microserviciu.login.users;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersController {

	@Autowired
	UsersService usersService;
	
	
	@RequestMapping("/senderUserManagement/login/sender/all")
	public List<Users> getUserService(){
		return usersService.getUsers();
	}
	
	
	 @RequestMapping(method=RequestMethod.POST,value="/senderUserManagement/login/sender")
	 public String setUsersObj(@RequestBody Users users) {
		 return usersService.setUsersObj(users);
	 }
	 
	
}
