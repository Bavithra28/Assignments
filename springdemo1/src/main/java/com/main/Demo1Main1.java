package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.Student1;

public class Demo1Main1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig1.xml");
		Student1 student = (Student1) applicationContext.getBean("student");
		System.out.println("Student number		: " + student.getStudentId());
		System.out.println("Student Firstname	: " + student.getFirstName());
		System.out.println("Student Latname		: " + student.getLastName());
		System.out.println(student.);
		System.out.println("The End");
	}

}
