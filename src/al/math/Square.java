package al.math;

public class Square implements TwoDShape {
	private double side;
	
	
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return side * 4;
	}
}
