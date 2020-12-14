package main;

import java.util.Scanner;

import service.Search;

public class SearchMain {

	public static void main(String[] args) {
		Search search=new Search();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to be searched");
		search.toFind=scanner.nextInt();
		search.toSearch();

	}

}
