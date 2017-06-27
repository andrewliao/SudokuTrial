package al.math;

public class Circle implements TwoDShape {
	public double radius;
	public static final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return radius * radius * PI;
	}
	
	public double perimeter() {
		return radius * 2 * PI;
	}
	
	
}
