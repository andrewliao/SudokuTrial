import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("You are the best!");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("current number is " + i);
		}
		
		Scanner console = new Scanner(System.in);
		calculation(console);
		
	}
	
	public static void calculation(Scanner console) {
		int x = console.nextInt();
		System.out.println(x);
	}
	
}
