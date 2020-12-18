package com.bean;
//Spring follow java bean coding standard
//default constructor==non parameter constructor

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplementsDemo implements InitializingBean, DisposableBean {
	private int studentId;
	private String firstName;
	private String lastName;
	//Injecting the values through default  constructor
	public ImplementsDemo() {
		super();
		System.out.println("Non parametrised constructor");
			}
	public ImplementsDemo(int studentId, String firstName, String lastName) {
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
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init()");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy()");
		
	}

}
