package com.packages.model;

public class DriverForm {

	private String emailDriver;
	private String status;

	public DriverForm() {
		
	}

	public DriverForm(String emailDriver, String status) {
		super();
		this.emailDriver = emailDriver;
		this.status = status;
	}

	public String getEmailDriver() {
		return emailDriver;
	}

	public void setEmailDriver(String emailDriver) {
		this.emailDriver = emailDriver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
