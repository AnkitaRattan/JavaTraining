//Q8 8Write a program to accept name and age of a person from the command
//prompt(passed as arguments when you execute the class) and ensure that
//the age entered is >=18 and < 60.

package exception;
import java.util.Scanner;
public class Age {

	static public void input(String Name, int age) throws Exception {

		if (age < 18 || age > 60) {
			throw new Exception("You are not elegiblie because of your age");
		} else {
			System.out.println("Entered name and age is acceptable");
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter your name ");
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		System.out.println("Enter the age ");
		int a = scan.nextInt();
		scan.close();
		try {
			input(n, a);
		} catch (Exception e) {
			System.out.println("Error message: " + e);
		}
	}
}