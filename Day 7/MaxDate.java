package main;

import java.util.Calendar;

public class MaxDate {
	public static void main(String[] args) {
	Calendar calender = Calendar.getInstance();
	System.out.println("Current Date and Time:" + calender.getTime());		
	int MaxYear = calender.getActualMaximum(Calendar.YEAR);
	int MaxMonth = calender.getActualMaximum(Calendar.MONTH);
	int MaxWeek = calender.getActualMaximum(Calendar.WEEK_OF_YEAR);
	int MaxDate = calender.getActualMaximum(Calendar.DATE);
	
	System.out.println("Actual Maximum Year: "+MaxYear);
	System.out.println("Actual Maximum Month: " +MaxMonth);
	System.out.println("Actual Maximum Week of Year: "+MaxWeek);
	System.out.println("Actual Maximum Date: "+MaxDate);

	}
}
