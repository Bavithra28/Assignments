package main;

import java.util.Scanner;

import service.StringPart;

public class StringPartMain {

	public static void main(String[] args) {
		StringPart stringpart=new StringPart();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string");
		stringpart.string1 = scanner.nextLine();
		
		Scanner scanner1= new Scanner(System.in);
		System.out.println("Enter the starting index");
		stringpart.index1 = scanner.nextInt();
		
		Scanner scanner2= new Scanner(System.in);
		System.out.println("Enter the ending index");
		stringpart.index2 = scanner.nextInt();
		stringpart.string2();
		

	}

}
