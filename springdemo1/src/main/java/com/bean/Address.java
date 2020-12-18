package com.bean;

public class Address {
	//Eager loading
	
	private int doorNo;
	private String city;
	private String state;
	public Address() {
		super();
		System.out.println("Address Constructor");
		
	}
	public Address(int doorNo, String city, String state) {
		super();
		System.out.println("With paramter address constructor");
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
