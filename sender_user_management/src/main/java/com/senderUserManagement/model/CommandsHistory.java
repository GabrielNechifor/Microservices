package com.senderUserManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="package_history")

public class CommandsHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
	Integer id;
@Column(name="sender_username")
	String username;
@Column(name="sender_name")
	String sender_name;
@Column(name="receiver_name")
String receiver_name;
@Column(name="package_name")
	String package_name;
@Column(name="pickup_date")
	String pickup_date;
@Column(name="deliver_date")
	String deliver_date;
@Column(name="pickup_adress")
	String pickup_adress;
@Column(name="deliver_adress")
	String deliver_adress;
	
		
		public CommandsHistory() { }
		
		public CommandsHistory(Integer id,String sender_username,String sender_name,String receiver_name
				,String package_name,String pickup_date,String deliver_date,String deliver_adress,String pickup_adress) {
			super();
			this.id=id;
			this.username = sender_username;
			this.sender_name=sender_name;
			this.receiver_name=receiver_name;
			this.package_name=package_name;
			this.pickup_date=pickup_date;
			this.deliver_date=deliver_date;
			this.pickup_adress=pickup_adress;
			this.deliver_adress=deliver_adress;

		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSender_username() {
			return username;
		}

		public void setSender_username(String sender_username) {
			this.username = sender_username;
		}

		public String getSender_name() {
			return sender_name;
		}

		public void setSender_name(String sender_name) {
			this.sender_name = sender_name;
		}

		public String getReceiver_name() {
			return receiver_name;
		}

		public void setReceiver_name(String sender_receivername) {
			this.receiver_name = sender_receivername;
		}

		public String getPackage_name() {
			return package_name;
		}

		public void setPackage_name(String package_name) {
			this.package_name = package_name;
		}

		public String getPickup_date() {
			return pickup_date;
		}

		public void setPickup_date(String pickup_date) {
			this.pickup_date = pickup_date;
		}

		public String getDeliver_date() {
			return deliver_date;
		}

		public void setDeliver_date(String deliver_date) {
			this.deliver_date = deliver_date;
		}

		public String getPickup_adress() {
			return pickup_adress;
		}

		public void setPickup_adress(String pickup_adress) {
			this.pickup_adress = pickup_adress;
		}

		public String getDeliver_adress() {
			return deliver_adress;
		}

		public void setDeliver_adress(String deliver_adress) {
			this.deliver_adress = deliver_adress;
		}
	
	
}
