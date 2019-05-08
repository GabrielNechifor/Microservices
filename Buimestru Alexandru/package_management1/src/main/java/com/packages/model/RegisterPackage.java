package com.packages.model;

public class RegisterPackage {

	private String emailSender;
	private String sender_adress;
	private String receiver_adress;
	private float volume;
	private float kilograms;
	private String phone_number_sender;
	private String phone_number_receiver;
    
	public RegisterPackage() {
		
	}

	public RegisterPackage(String emailSender, String sender_adress, String receiver_adress, float volume, float kilograms,
			String phone_number_sender, String phone_number_receiver) {
		super();
		this.emailSender = emailSender;
		this.sender_adress = sender_adress;
		this.receiver_adress = receiver_adress;
		this.volume = volume;
		this.kilograms = kilograms;
		this.phone_number_sender = phone_number_sender;
		this.phone_number_receiver = phone_number_receiver;
	}

	public String getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(String emailSender) {
		this.emailSender = emailSender;
	}

	public String getSender_adress() {
		return sender_adress;
	}

	public void setSender_adress(String sender_adress) {
		this.sender_adress = sender_adress;
	}

	public String getReceiver_adress() {
		return receiver_adress;
	}

	public void setReceiver_adress(String receiver_adress) {
		this.receiver_adress = receiver_adress;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getKilograms() {
		return kilograms;
	}

	public void setKilograms(float kilograms) {
		this.kilograms = kilograms;
	}

	public String getPhone_number_sender() {
		return phone_number_sender;
	}

	public void setPhone_number_sender(String phone_number_sender) {
		this.phone_number_sender = phone_number_sender;
	}

	public String getPhone_number_receiver() {
		return phone_number_receiver;
	}

	public void setPhone_number_receiver(String phone_number_receiver) {
		this.phone_number_receiver = phone_number_receiver;
	}
	
	
}
