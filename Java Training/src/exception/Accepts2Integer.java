//Q9 Write a program that accepts 2 integers a and b as input and finds the
//quotient of a/b.
//This program may generate an Arithmetic Exception
package exception;
import java.util.*;
public class Accepts2Integer {

	public static void main(String args[]) {

		int a;
		int b;

		Scanner s = new Scanner(System.in);
		System.out.println("enter the two numbers: ");
		a = s.nextInt();

		b = s.nextInt();
		s.close();
		try {
			int c = a / b;
			System.out.println("The quotiont of " + a + "/" + b + " is " + c);
		} catch (Exception e) {
			System.out.println("Dividebyzero Exception caught");
		} finally {

			System.out.println("In the finally block");
		}
	}
}
