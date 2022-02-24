package assignment2;
//Q9 Write a Java program to calculate the sum of the numbers appear in a given
//string.
public class Sumofno {

	public static void main(String[] args) {
				String str = "hii 10 ende7 asdfg 18";
				
		        String temp = "0";

		        int sum = 0;

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if (Character.isDigit(ch))
		                temp += ch;
		            
		            else {
		                sum += Integer.parseInt(temp);
		                temp = "0";
		            }
		        }

		      System.out.println( sum + Integer.parseInt(temp));
				
				
			}

		}