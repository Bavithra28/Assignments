package service;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	private String name;
	int area;
	public Rectangle(int length, int breadth, String name) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area;
	}
	

}
