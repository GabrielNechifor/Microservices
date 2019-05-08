package com.packages.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="packages")
public class CommandsHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
	Integer id;
@Column(name="email_sender")
	String emailSender;
@Column(name="emailDriver")
	String emailDriver;
@Column(name="sender_adress")
String sender_adress;
@Column(name="receiver_adress")
String receiver_adress;
@Column(name="volume")
float volume;
@Column(name="kilograms")
float kilograms;
@Column(name="phone_number_sender")
String phone_number_sender;
@Column(name="phone_number_receiver")
	String phone_number_receiver;
@Column(name="pin")
	int pin;
@Column(name="status")
	String status;

		
	public CommandsHistory() { }

	public CommandsHistory(Integer id, String email_sender, String email_driver, String sender_adress,
			String receiver_adress, float volume, float kilograms, String phone_number_sender,
			String phone_number_receiver, int pin, String status) {
		super();
		this.id = id;
		this.emailSender = email_sender;
		this.emailDriver = email_driver;
		this.sender_adress = sender_adress;
		this.receiver_adress = receiver_adress;
		this.volume = volume;
		this.kilograms = kilograms;
		this.phone_number_sender = phone_number_sender;
		this.phone_number_receiver = phone_number_receiver;
		this.pin = pin;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail_sender() {
		return emailSender;
	}


	public void setEmail_sender(String email_sender) {
		this.emailSender = email_sender;
	}


	public String getEmail_driver() {
		return emailDriver;
	}


	public void setEmail_driver(String email_driver) {
		this.emailDriver = email_driver;
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


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

}

