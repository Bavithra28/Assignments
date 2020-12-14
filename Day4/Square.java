package service;

public class Square extends Shape{
	private int side;
	private String name;
	int area;
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Square(int side, String name) {
		super();
		this.side = side;
		this.name = name;
	}
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area;
	}

}
