import al.math.ALMath;
import al.math.Circle;
import al.math.Square;
import al.math.TwoDShape;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = ALMath.squareArea(3.0);
		double perimeter = ALMath.squarePerimeter(3.0);
		
		System.out.println("Squrare area for side 3 is " + area);
		System.out.println("Square perimeter for side 3 is " + perimeter);
		
		TwoDShape s1 = new Square(4.0);
		area = s1.area();
		perimeter = s1.perimeter();
		System.out.println(area);
		System.out.println(perimeter);
		
		TwoDShape s2 = new Square(5.0);
		area = s2.area();
		perimeter = s2.perimeter();
		System.out.println(area);
		System.out.println(perimeter);
		
		TwoDShape s3 = new Circle(5.0);
		area = s3.area();
		perimeter = s3.perimeter();
		System.out.println(area);
		System.out.println(perimeter);

		
	}

}