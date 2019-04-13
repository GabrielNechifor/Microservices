package com.microserviciu.login.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login_data")
public class Users {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="role")
	private String role;
	@Column(name="password")
	private String password;
	
	public Users() {
		
	}
	
	public Users(String username, String role, String password) {
		this.username=username;
		this.role=role;
		this.password=password;	
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
