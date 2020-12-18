package com.bean;
//Spring follow java bean coding standard
//default constructor==non parameter constructor

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private Address address;  //has a relationship== dependency injection
	public Address getAddress() {
		return address;
	}
	public Student(int studentId, String firstName, String lastName, Address address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//Injecting the values through default  constructor
	public Student() {
		super();
		System.out.println("Non parametrised constructor");
			}
	public Student(int studentId, String firstName, String lastName) {
		super();
		System.out.println("Parametrised constructor");
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
