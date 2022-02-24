package assignment2;
//Q1 Write a Java program to compare two strings lexicographically,
//ignoring case differences2.
public class Ignoring {
	public static void main(String[] args) {	
		String str1 = "GOOD MORNING";
		String str2 = "GOOD MORNING";

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
		}
		
		else if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
		}
		else 
		{
			System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
		}

	}

}
