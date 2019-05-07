package com.packages.model;

public class ModifyPackageInformation {

	private int id;
	private String emailDriver;
	private String status;

	public ModifyPackageInformation() {
		
	}

	public ModifyPackageInformation(int id,String emailDriver, String status) {
		super();
		this.id=id;
		this.emailDriver = emailDriver;
		this.status = status;
	}
	public ModifyPackageInformation(String emailDriver, String status) {
		super();
		this.id=0;
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

	public int getId() {
		return this.id;
	}
	
	
}
