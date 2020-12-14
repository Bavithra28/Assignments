package service;

public class Odd {
	public int number;
	public void position() {
		int sum=0;
	     
	    int remainder;
		while(number>0){
	    remainder = number%10;
		if(remainder%2!=0){
	        sum= sum+remainder;
	      }
	      number = number/10;
	    }
	    
	    if(sum%2==0){
	      System.out.println("Sum of odd digits is EVEN");
	    }else{
	      System.out.println("Sum of odd digits is ODD");
	    }
	    
	  }
	}
