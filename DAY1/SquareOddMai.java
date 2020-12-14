package main;

import java.util.Scanner;
import service.SquareOdd;

public class SquareOddMai {
	public static void main(String[] args) {
		SquareOdd squareodd= new SquareOdd();
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter a number");
		squareodd.number=scanner.nextInt();
		squareodd.position();
	}
}
