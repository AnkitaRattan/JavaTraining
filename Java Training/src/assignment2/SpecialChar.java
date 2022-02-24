package assignment2;

import java.util.Scanner;

//Q8 Write a Java program to check whether the character immediately before and
//after a specified character is same in a given string.
public class SpecialChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the String with special char");
		String stng = scan.nextLine();
		int l = stng.length();
		int count = 0;
		scan.close();
		for (int i = 0; i < l; i++) {
			String tmpString = stng.substring(i, i + 1);
			if (tmpString.equals("#") && i > 0 && i < l - 1) {
				if (stng.charAt(i - 1) == stng.charAt(i + 1)) {
					count = 1;
				} else {
					count = 2;
				}
			}

		}
		if (count == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}