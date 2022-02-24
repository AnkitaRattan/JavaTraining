package assignment1;

public class Primenumbers {
	public static void main(String args[]) {
		for(int j=1;j<=100;j++) {
			int count=0;
			for(int p=2;p<j;p++) {
				if(j%p==0) {
					count++;
					break;
				}}
			if(count==0 && j!=1) {
				System.out.println(j+" ");
				}
			}
		}
	}
		
     