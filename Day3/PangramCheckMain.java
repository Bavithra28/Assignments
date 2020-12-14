package main;

import java.util.Scanner;

import service.PangramCheck;

public class PangramCheckMain {
	public static void main(String[] args) {
		PangramCheck pangramcheck = new PangramCheck();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String:");
		pangramcheck.string1 = scanner.nextLine();
		pangramcheck.check();
		scanner.close();
	}

}
