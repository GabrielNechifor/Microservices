package com.example.demo.microserviciu.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_data")
public class LoginData {

	@Id
	@Column(name="name")
     private String name;
	@Column(name="password")
     private String password;
     
     public LoginData() { }
     
     
	public LoginData(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
     
     
}
