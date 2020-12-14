package main;

import java.util.Scanner;

import service.Odd;

public class OddMain {

	public static void main(String[] args) {
		Odd odd= new Odd();
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter a number");
		odd.number=scanner.nextInt();
		odd.position();
		
	}

}
