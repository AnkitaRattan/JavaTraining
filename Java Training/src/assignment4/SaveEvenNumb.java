//Q6 Implement the assignment 1 using Linked List
package assignment4;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class SaveEven {
	List<Integer> arraylist = new LinkedList<Integer>();

	public void saveEvenNum(int N) {
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				arraylist.add(i);
			}
		}
		System.out.println(arraylist);
	}

	public void printEvenNumbers() {
		List<Integer> a2 = new LinkedList<Integer>();

		for (int i = 2; i < arraylist.size(); i++) {
			int y = arraylist.get(i) * 2;
			a2.add(y);
		}
		System.out.println(a2);

	}

}

public class SaveEvenNumb {

	public static void main(String[] args) {
		SaveEven sen = new SaveEven();
		sen.saveEvenNum(10);
		sen.printEvenNumbers();
	}
}