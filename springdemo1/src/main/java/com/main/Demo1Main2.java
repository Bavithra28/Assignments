package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bean.Student2;

public class Demo1Main2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig2.xml");
		Student2 student = (Student2) applicationContext.getBean("student1");
		System.out.println("Student number		: " + student.getStudentId());
		System.out.println("Student Firstname	: " + student.getFirstName());
		System.out.println("Student Lastname		: " + student.getLastName());
		System.out.println("The End");

	}

}
