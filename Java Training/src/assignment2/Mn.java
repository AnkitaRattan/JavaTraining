package assignment2;
// Q10 Write a Java program to count the number of words ending in 'm' or 'n' (not
//case sensitive) in a given text.
import java.util.Scanner;

public class Mn {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= scan.nextLine();
		int k=str.length();
		int count=0;
		scan.close ();
		for(int i=0;i<k-1;i++) {
			
			if(str.charAt(i)=='m' || str.charAt(i)=='n' || str.charAt(i)=='M' || str.charAt(i)=='N') {
				if(str.charAt(i+1)==' ' && str.charAt(i-1)!=' ') {
					count++;
				}
		
		}
				}
		System.out.println(count);	}

}