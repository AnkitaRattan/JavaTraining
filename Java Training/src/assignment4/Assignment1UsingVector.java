//Q7 Implement the assignment 1 using Vector
package assignment4;
import java.util.*;
class SaveEvenNumber {
	Vec<Integer> vc = new Vec<Integer>();

	public void saveEvenNum(int N) {
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				vc.add(i);
			}
		}
		System.out.println(vc);
	}

	public void printEvenNumbers() {
		Vec<Integer> a2 = new Vec<Integer>();

		for (int i = 2; i < vc.size(); i++) {
			int y = vc.get(i) * 2;
			a2.add(y);
		}
		System.out.println(a2);

	}

}

public class Assignment1UsingVector {

	public static void main(String[] args) {
		SaveEvenNumber s = new SaveEvenNumber();
		s.saveEvenNum(10);
		s.printEvenNumbers();
	}
}
