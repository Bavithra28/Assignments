package main;

import java.util.Calendar;

public class getDateTimeFromUser {

	public static void main(String[] args) {
	    {
	        Calendar calender = Calendar.getInstance();
	        System.out.println("Year: " + calender.get(Calendar.YEAR));
	        System.out.println("Month: " + calender.get(Calendar.MONTH));
	        System.out.println("Day: " + calender.get(Calendar.DATE));
	        System.out.println("Hour: " + calender.get(Calendar.HOUR));
	        System.out.println("Minute: " + calender.get(Calendar.MINUTE));
	    }
	}


}
