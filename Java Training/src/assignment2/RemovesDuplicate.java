package assignment2;
import java.util.Scanner;
//Q3 Write a Java program to print after removing duplicates from a
//given string
public class RemovesDuplicate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		scan.close ();
		String y[] = str.split(" ");
		int j = y.length;
		String z = "";

		int i;
		for (i = 0; i < j; i++) {
			int count = 0;
			for (int k = i + 1; k < j; k++) {

				if (y[i].equals(y[k])) {

					count++;

				}

			}

			if (count == 0) {
				z = z + y[i] + " ";
			}

		}
		System.out.println(z);
	}
}