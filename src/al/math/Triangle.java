package al.math;

public class Triangle implements TwoDShape {
	public double base;
	public double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return 0.5 * base * height;
	}
	
	public double perimeter() {
		return base * 3;
	}
	
}
