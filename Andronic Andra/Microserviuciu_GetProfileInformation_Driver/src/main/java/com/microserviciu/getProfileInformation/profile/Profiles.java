package com.microserviciu.getProfileInformation.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_information_driver")
public class Profiles {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="credit_card")
	private String creditCard;
	@Column(name="number_of_deliveries")
	private int numberOfDeliveries;
	
	public Profiles() {
		
	}
	
	public Profiles(String username, String creditCard, int numberOfDeliveries) {
		super();
		this.username = username;
		this.creditCard = creditCard;
		this.numberOfDeliveries = numberOfDeliveries;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public int getNumberOfDeliveries() {
		return numberOfDeliveries;
	}
	public void setNumberOfDeliveries(int numberOfDeliveries) {
		this.numberOfDeliveries = numberOfDeliveries;
	}

}
