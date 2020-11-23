import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		Scanner scan = new Scanner (System.in);
		String name = scan.next();
		
		String greeting = "Hello " + name;
		System.out.println(greeting);
		
	}

}
