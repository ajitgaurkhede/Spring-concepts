package com.firstspring.myFirst;

public class Tyre {

	private String brand;
	
	 private Address address;

	//Constructor Injection
	public Tyre(String brand ,Address address) {
		super();
		this.address = address;
		this.brand = brand;
	}

	public Address getAddress() {
		return address;
	}

	/*//setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}*/

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", address=" + address + "]";
	}


	
	public Tyre() {
		
		
	}
	
	public void myInit() {
		
		System.out.println("----Object Init---");
	}
	
	
	public void myDestroyed() {
		
		System.out.println("----Object Destroyed---");
	}
	
	
	
	
	
	
	
}
