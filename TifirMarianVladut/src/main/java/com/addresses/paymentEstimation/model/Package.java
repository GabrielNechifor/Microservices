package com.addresses.paymentEstimation.model;

public class Package {

	public Package(float volume, float kilograms, float price) {
		super();
		this.volume = volume;
		this.kilograms = kilograms;
		this.price = price;
	}
	float volume;
	float kilograms;
	float price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
