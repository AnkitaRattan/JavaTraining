package string;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string\n");
			String str= s.nextLine();
			System.out.println("Enter the char whose frequency you want to check\n");
			char c=s.next().charAt(0);
			int count=0;
			s.close();
			String str1= str.toLowerCase();
			char string[] = str1.toCharArray(); 
			char p= Character.toLowerCase(c);
			for(int i=0; i<str.length();i++) {
				if(p==string[i]) {
					count++;
				}
				else {
					
				}
				}
			System.out.println("The frequency of the letter "+c+" is "+count);}
			

	}


