package service;

public class DayFive {
	public static void main(String[] args) {
			try {
		    int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
				System.out.println(n1/n2);
				}
		catch(java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
				}
		catch(java.lang.NumberFormatException a) {
			System.out.println("java.util.InputMismatchExceptio");
			}	
		System.out.println("end");
			

	}

}
