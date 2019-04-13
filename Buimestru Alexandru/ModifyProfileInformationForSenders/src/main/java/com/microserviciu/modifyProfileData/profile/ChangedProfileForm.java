package com.microserviciu.modifyProfileData.profile;


public class ChangedProfileForm {

	String address1;
	String address2;
	String address3;
	String credit_card;
	String number_of_packages_sent;
	
	public ChangedProfileForm() {
		
	}
	
	public ChangedProfileForm(String address1, String address2, String address3,
			String credit_card, String number_of_packages_sent) {
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.credit_card = credit_card;
		this.number_of_packages_sent = number_of_packages_sent;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}
	public String getNumber_of_packages_sent() {
		return number_of_packages_sent;
	}
	public void setNumber_of_packages_sent(String number_of_packages_sent) {
		this.number_of_packages_sent = number_of_packages_sent;
	}
	
	

}
