package al.math;

public class Rectangle implements TwoDShape {
	private double side;
	private double height;
	
	public Rectangle(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	public double area() {
		return side * height;
	}
	
	public double perimeter() {
		return side * 2 + height * 2;
	}
}
