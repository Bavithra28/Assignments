package com.bean;

import java.util.List;

public class ListDemo {
	private int id;
	private String fname;
	private String lname;
	private List<Address> addressess;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Address> getAddressess() {
		return addressess;
	}
	public void setAddressess(List<Address> addressess) {
		this.addressess = addressess;
	}
	public ListDemo(int id, String fname, String lname, List<Address> addressess) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.addressess = addressess;
	}
	public ListDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
