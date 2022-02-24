package controlstatements;
import java.util.*;
public class IfElse {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("enter value : ");
			int value1 = s.nextInt();
			System.out.println("enter value : ");
			int value2 = s.nextInt();
			s.close();
			if(value1<=value2) {
				System.out.println("the greatest value is " +value2);
			}
			else {
				System.out.println("the greatest value is " +value1);
			}
		}

	}