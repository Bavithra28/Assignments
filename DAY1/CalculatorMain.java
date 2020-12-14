package main;

import service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int number = calculator.add(4, 5);
		System.out.println("The sum is " + number);

	}

}
