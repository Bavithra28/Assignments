package main;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class stringToDate {

	public static void main(String[] args) throws ParseException { 
		    String Date="23/11/2020";  
		    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(Date);  
		    System.out.println(Date + " " + date);  
	}

}
