package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Parent;

import com.bean.Parent1;

public class ParentDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/parentdemo.xml");
		/* Parent parent = (Parent) applicationContext.getBean("Hai");
		 System.out.println(parent.getA());
		System.out.println(parent.getAa());*/
		Parent1 parent1 = (Parent1) applicationContext.getBean("two");
		System.out.println(parent1.getA());
		System.out.println(parent1.getAa());
		System.out.println(parent1.getB());

	}

}
