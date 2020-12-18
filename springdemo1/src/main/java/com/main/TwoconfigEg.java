package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwoconfigEg {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/twoconfig1.xml","com/config/twoconfig2.xml");
		
		//string array of config files
		//ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext(new String[] {"com/config/twoconfig1.xml","com/config/twoconfig2.xml"});
		
		
		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("com/config/twoconfig1.xml");
		
		System.out.println("The END");
	}

}
