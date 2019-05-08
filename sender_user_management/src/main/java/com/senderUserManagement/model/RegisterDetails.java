package com.senderUserManagement.model;

public class RegisterDetails {
	
	String username;
	String email;
	String password;
	String phone_number;
	
	public RegisterDetails(String username,String email,String password,String phone_number)
	{
		this.username=username;
		this.email=email;
		this.password=password;
		this.phone_number=phone_number;
	}
	public RegisterDetails(RegisterDetails userDetails)
	{
		this.username=userDetails.username;
		this.email=userDetails.email;
		this.password=userDetails.password;
		this.phone_number=userDetails.phone_number;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
