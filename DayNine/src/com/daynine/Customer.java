package com.daynine;

public class Customer {
	
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
