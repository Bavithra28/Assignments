package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.ListDemo;
import com.bean.Student;

public class ListDemoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/list demo.xml");
		 ListDemo listdemo = (ListDemo) applicationContext.getBean("ld"); 
		 System.out.println("memory address:" + listdemo);
		 System.out.println(listdemo.getId());
		 System.out.println(listdemo.getFname());
		 System.out.println(listdemo.getLname());
		 List<Address> temp= listdemo.getAddressess();
		 for (Address address : temp) {
			 System.out.println(address.getDoorNo());
			 System.out.println(address.getCity());
			 System.out.println(address.getState());
			 
			
		}
		 

	}

}
