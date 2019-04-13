package com.example.demo.microserviciu.cursuri;

import org.springframework.stereotype.Component;

@Component
public class JwtCursuri {



	private String username;

	public JwtCursuri() {}
	
	public JwtCursuri(String username) {
		super();
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
