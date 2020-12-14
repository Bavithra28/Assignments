package main;

import java.util.Scanner;

import service.Replace;

public class ReplaceMain {

	public static void main(String[] args) {
		Replace replace=new Replace();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the String");
	    replace.string1=scanner.nextLine();
	    replace.string2();
		

	}

}
