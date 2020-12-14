package service;

import java.util.Scanner;

public class PangramCheck {
	public String string1;
	public char i;

	public void check() {

		string1 = string1.toLowerCase();
		System.out.println(string1);
		String string2 = "";
		for ( i = 'a'; i <= 'z'; i++) {
			if (string1.indexOf(i) != -1) {
				string2 = string2 + i;
				System.out.println(string2);
			}
		}
		if (string2.length() == 26) {
			System.out.println("Given string is Pangram");
		} else {
			System.out.println("Given string is Not Pangram");
		}
	}
}