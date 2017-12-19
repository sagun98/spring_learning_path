package com.example.main;

public class Address {
	private String street;
	private String cityState;
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCityState(String cityState) {
		this.cityState = cityState;
	}

	
	public String toString() {
		return this.street +" "+this.cityState;
	}
}
