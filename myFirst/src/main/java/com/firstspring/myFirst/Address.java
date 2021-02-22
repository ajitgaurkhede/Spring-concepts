package com.firstspring.myFirst;

public class Address {

	
	private String city;
	
	private int zipCode;

	public String getCity() {
		return city;
	}
	
	public Address() {
		
	}

	public Address(String city, int zipCode) {
		super();
		this.city = city;
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
	
}
