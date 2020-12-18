package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Student;

public class Demo1MainAddress {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfigaddress.xml");
		//Student student = (Student) applicationContext.getBean("student");
		Address ref= (Address) applicationContext.getBean("address");
		System.out.println(ref.getDoorNo());
		System.out.println(ref.getCity());
		System.out.println(ref.getState());
		//System.out.println("Student number		: " + student.getStudentId());
		//System.out.println("Student Firstname	: " + student.getFirstName());
		//System.out.println("Student Lastname		: " + student.getLastName());
		//System.out.println("The End");
	}

}
