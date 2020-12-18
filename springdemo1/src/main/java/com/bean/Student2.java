package com.bean;

public class Student2 {
	private int studentId;
	private String firstName;
	private String lastName;
	// one class with two different objects
	
	public Student2(int studentId, String firstName, String lastName) {
		super();
		System.out.println("Parametrised Constructor");
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
