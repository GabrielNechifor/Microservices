package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserLoginData 
{
	@Id
	private String username;
	private String password;
	private String role;
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public String getRole()
	{
		return role;
	}


}
