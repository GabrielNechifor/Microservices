package com.microserviciu.modifyProfileData.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_information_driver")
public class ProfileForm {
	
	@Id
	@Column(name="username")
	String username;
	
	@Column(name="credit_card")
	String credit_card;
	@Column(name="number_of_deliveries")
	String number_of_deliveries;
	
	public ProfileForm() {
		
	}

	public ProfileForm(String username, String credit_card, String number_of_deliveries) {
		super();
		this.username = username;
		this.credit_card = credit_card;
		this.number_of_deliveries = number_of_deliveries;
	}
	
	public ProfileForm(String username2, ChangedProfileForm changedProfile) {
		this.username = username2;
		this.credit_card = changedProfile.getCredit_card();
		this.number_of_deliveries = changedProfile.getNumber_of_deliveries();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

	public String getNumber_of_deliveries() {
		return number_of_deliveries;
	}

	public void setNumber_of_deliveries(String number_of_deliveries) {
		this.number_of_deliveries = number_of_deliveries;
	}
	
	

}
