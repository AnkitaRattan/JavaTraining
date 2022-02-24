package string;

public class StringMethods {

	public static void main(String[] args) {
		
				String s ="Hi everyone";
				String s1 ="Hi everyone";
				String str[]= s.split(" ");
				for(int i=0;i<str.length;i++)
				{
				System.out.println(str[i]);
				}
				System.out.println(s.concat(" home"));
				
				if(s1.equals(s)) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
				
				System.out.println(s.length());
				System.out.println(s.replace("Hi everyone","HI EVERYONE"));
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				System.out.println(s.trim());
				System.out.println(s.endsWith("ne"));
				System.out.println(s.startsWith("Hi"));
				System.out.println(s.substring(2,4));
				System.out.println(s.indexOf("i"));
				System.out.println(s.lastIndexOf("H"));
			}

		
		
}		
