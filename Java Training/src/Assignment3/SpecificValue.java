package Assignment3;
import java.util.*;
public class SpecificValue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int u=scan.nextInt();
		scan.close();
		
int[] arr= {2,3,44,66,71};
for(int i=0;i<arr.length;i++) {
	if (arr[i]==u) {
		System.out.println("Present");
		break;
	}
	if (i==arr.length-1) {
		System.out.println("not Present");
	}
}
}

}