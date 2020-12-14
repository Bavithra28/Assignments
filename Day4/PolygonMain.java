package main;

import java.awt.Rectangle;
import java.util.Scanner;

import service.Circle;
import service.Square;

public class PolygonMain {

	public static void main(String[] args) {
	
	Scanner scanner=new Scanner (System.in);
	System.out.println("Enter the shape name");
	String area= scanner.nextLine();
	
	Circle circle=new Circle(area, 0);
	circle.setRadius(10);
	circle.setName(area);
	System.out.println(circle.getRadius());
	System.out.println(circle.getName());
	}
}
	
	/*Rectangle rectangle= new Rectangle(10,10);
	rectangle.setLength(10);
	rectangle.setBreadth(20);
	System.out.println(rectangle.getWidth());
	System.out.println(rectangle.getWidth());
	Square square=new Square(0, area);
	
	*/
