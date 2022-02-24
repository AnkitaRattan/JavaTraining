package assignment2;
import java.util.Scanner;
//Q7 Write a Java program to count how many times the substring 'life' present at
//anywhere in a given string
public class Substring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string:\n");
		String str = scan.nextLine();
		System.out.println("String :"  +str);
		System.out.println("entersubstring:\n");
		String substr = scan.nextLine();
		int subStrCount =0;
		
		int index =0;
		scan.close ();
		while((index = str.indexOf(substr,index))>=0) {
			subStrCount++;
			index =  index + substr.length();
			
		}
		
		System.out.println("Substring: "+substr+ " found " +subStrCount+ " times!");
	

}}