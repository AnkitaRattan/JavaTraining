package assignment2;
//Q6 Wap to check string is palindrome or not like “madam”
public class Palindrome {
	public static void main(String[] args) {

		String s = "madam";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		if (s.equals(rev)) {
			System.out.println("String is a palindrome");
			}
		else {
			System.out.println("String is not a palindrome");
			}
		}
}