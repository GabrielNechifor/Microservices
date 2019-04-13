package com.microserviciu.modifyProfileData.profile;


public class ChangedProfileForm {

	String credit_card;
	String number_of_deliveries;
	
	public ChangedProfileForm() {
		
	}

	public ChangedProfileForm(String credit_card, String number_of_deliveries) {
		super();
		this.credit_card = credit_card;
		this.number_of_deliveries = number_of_deliveries;
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

	public void setNumber_of_packages_sent(String number_of_deliveries) {
		this.number_of_deliveries = number_of_deliveries;
	}
	
	

}
