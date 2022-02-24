package assignment1;

import java.util.Scanner;
public class Reverse {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int x = scan.nextInt();
    scan.close ();
    int k=0;
    for(int y=x;y!=0;k++) {
    	y=y/10;
    }
    int result=0;
    k--;
    for(int y=x;y!=0;y=y/10) {
    	int remainder=y%10;
    	result+=remainder*Math.pow(10,k);
    	k--;
    }	
		System.out.println("Reverse of the entered number is: "+result);}
	}
