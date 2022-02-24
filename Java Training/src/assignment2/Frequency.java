package assignment2;

import java.util.Scanner;

//Q5 Write a Java program to print the frequency of each character
//in a string
public class Frequency {

	public static void main(String[] args) {
		
				
				Scanner scan = new Scanner(System.in);	
				System.out.println("enter a sentence:");
				String s = scan.nextLine();
				for (char ch = 'a'; ch <= 'z'; ch++) {
					int count = 0;
					scan.close ();
					for (int i = 0; i < s.length(); i++) {
						if (ch == s.charAt(i)) {
							count++;
						}
					}
					if (count != 0) {
						System.out.println(ch + " " + count);
					}
							
				}
			}

		}