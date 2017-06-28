import al.math.ALMath;
import al.math.Circle;
import al.math.Square;
import al.math.TwoDShape;
import al.math.Triangle;
import al.math.Rectangle;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = ALMath.squareArea(3.0);
		double perimeter = ALMath.squarePerimeter(3.0);
		
		System.out.println("Squrare area for side 3 is " + area);
		System.out.println("Square perimeter for side 3 is " + perimeter);
		
		Square s1 = new Square(4.0);
		printInfo(s1);
		
		Square s2 = new Square(5.0);
		printInfo(s2);
		
		Circle s3 = new Circle(5.0);
		printInfo(s3);

		Triangle s4 = new Triangle(5.0, 3.0);
		printInfo(s4);
		
		Rectangle s5 = new Rectangle(5.0, 3.0);
		printInfo(s5);
		
		
	}
	
	private static void printInfo(TwoDShape shape) {
		double area = shape.area();
		double perimeter = shape.perimeter();
		System.out.println(area);
		System.out.println(perimeter);
	}

}

