package service;

public class Day51 {

	public static void main(String[] args) {
		try {
		    int totalRunsScored=Integer.parseInt(args[0]);
			int totalOversFaced=Integer.parseInt(args[1]);
		    float runRate= totalRunsScored/totalOversFaced;
		    System.out.println("Current Run Rate" +runRate);
			}
		catch(java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
				}
		catch(java.lang.NumberFormatException a) {
			System.out.println("java.lang.NumberFormatException");
			}	
		System.out.println("end");

	}

}
