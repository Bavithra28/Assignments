package main;

import java.util.Scanner;

import service.PositionsMain;
public class Positions {

	public static void main(String[] args) {
			PositionsMain a =new PositionsMain();
		    Scanner scanner    =   new Scanner(System.in);
		    System.out.println(" Enter the string");
		    a.string=scanner.nextLine();
		    a.area();
	}
}
		    
		
