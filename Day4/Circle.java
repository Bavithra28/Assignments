package service;

public class Circle extends Shape {
	private int radius;
	private String name;
	int area;
	
	public Circle(String name, int area) {
		super();
		this.name = name;
		this.area = area;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
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
