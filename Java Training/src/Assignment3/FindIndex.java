//Q3 Write a Java program to find the index of an array element
package Assignment3;

public class FindIndex {
	
	public static void main(String[] args) {
	
		int length = 100;
		int[] arr = new int[length];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = i*4;
		}
		System.out.println("Elements are ");
		for(int a:arr) {
			System.out.println(a);
		}
		int findIndex = 80;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==findIndex) {
				System.out.println("index "+i);
			}
		}
	
	}
}
