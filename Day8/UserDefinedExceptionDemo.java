package main;

import java.UserDefinedException;

public class UserDefinedExceptionDemo {
	public static void main(String[] args) {
		hrservice service=new hrservice();
		boolean valid;
		try {
			valid=hrservice.validateage(5);
			System.out.println("eligible");
			
		}catch(UserDefinedException ude) {
			System.err.println(ude.getMessage());
		}
		sys
	}

}
