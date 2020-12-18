package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Demo1Main {

	public static void main(String[] args) {
		// load the configuration file
		// BeanFactory -->ApplicationContext
		// List<E> list =new ArrayList();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		 Student student = (Student) applicationContext.getBean("student"); //IOC
		 //student.setFirstName("Be");
		 //student.setLastName("Happy");
		 //student.setStudentId(10);
		 System.out.println("Student number: " + student.getStudentId());
		 System.out.println("Student Firstname: " + student.getFirstName());
		 System.out.println("Student Latname: " + student.getLastName());
		 System.out.println(student.getAddress().getState());
		System.out.println("The End");
	}

}
