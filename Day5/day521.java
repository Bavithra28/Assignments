package main;

import java.util.Scanner;

public class day521 {

	public static void main(String[] args) throws Exception {
		
		 {
			  Scanner scanner = new Scanner(System.in);
	          System.out.println("Enter Player Name");
	          String name = scanner.nextLine();         
	 
	          Scanner scanner1 = new Scanner(System.in);
	          System.out.println("Enter Your Age");
	          int age = scanner1.nextInt();         
	 
	          try
	          {
	              if(age < 16)
	              {
	                  throw new Exception();    
	              }
	          }
	          catch(java.lang.NumberFormatException a) {
	  			System.out.println("java.lang.NumberFormatException");
	  			}	
	  		System.out.println("end");
	    }
	}


}
