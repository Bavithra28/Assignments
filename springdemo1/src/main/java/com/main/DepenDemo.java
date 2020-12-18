package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class DepenDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getAddress().getDoorNo());

	}

}
