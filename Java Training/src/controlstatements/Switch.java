package controlstatements;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
			
     Scanner s = new Scanner(System.in);
			
	int age = s.nextInt();
	s.close();
	switch(age){
	    case 20:
	    System.out.println("you are an adult now!");
		break;
	    case 38:
		System.out.println("your age is 38.");
		break;
		default:
		System.out.println("your age is" + age);
		
			}		
	}
	}
	
