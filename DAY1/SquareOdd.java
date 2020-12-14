package service;

public class SquareOdd {
	public int number;
	public void position() {
		int number1=0;
		int number2=0;
		    while(number!=0)
		    {
		    number1=number%10;
		    if((number1%2)==0)
		    number2+=number1*number1;
		    number/=10;
		    }
		   System.out.println(number2);
		}

}
