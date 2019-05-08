package com.senderUserManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile_data")
public class Profiles {

	@Id
	@Column(name = "username")
	String username;

	@Column(name = "email")
	String email;
	@Column(name = "phone_number")
	String phone_number;
	@Column(name = "country")
	String country;
	@Column(name = "photo")
	String photo;
	@Column(name = "address1")
	String address1;
	@Column(name = "address2")
	String address2;
	@Column(name = "address3")
	String address3;
	@Column(name = "address4")
	String address4;
	@Column(name = "address5")
	String address5;

	public Profiles() {

	}

	public Profiles(Profiles profile) {
		this.username = profile.username;
		this.email = profile.email;
		this.phone_number = profile.phone_number;
		this.country = profile.country;
		this.address1 = profile.address1;
		this.address2 = profile.address2;
		this.address3 = profile.address3;
		this.address4 = profile.address4;
		this.address5 = profile.address5;
		this.photo = profile.photo;

	}

	public Profiles(String username, String email, String phone_number, String country, String photo, String address1,
			String address2, String address3, String address4, String address5) {
		this.username = username;
		this.email = email;
		this.phone_number = phone_number;
		this.country = country;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.address5 = address5;
		this.photo = photo;

	}
	// public Profiles(String username2, ChangedProfiles changedProfile,Profiles
	// profile) {
	// this.username=username2;
	// if(changedProfile.getAddress1()!= null) this.address1 =
	// changedProfile.getAddress1();
	// if(changedProfile.getAddress2()!= null) this.address2 =
	// changedProfile.getAddress2();
	// if(changedProfile.getAddress3()!= null) this.address3 =
	// changedProfile.getAddress3();
	// if(changedProfile.getAddress4()!= null) this.address4 =
	// changedProfile.getAddress4();
	// if(changedProfile.getAddress5()!= null) this.address5 =
	// changedProfile.getAddress5();
	// if(this.address1== null) this.address1=profile.address1;
	// if(this.address2== null) this.address2=profile.address2;
	// if(this.address3== null) this.address3=profile.address3;
	// if(this.address4== null) this.address4=profile.address4;
	// if(this.address5== null) this.address5=profile.address5;

	// }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

}
