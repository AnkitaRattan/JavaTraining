//Q1Develop a java class with a method saveEvenNumbers(int N)
//using ArrayList to store even numbers from 2 to N, where N is a
//integer which is passed as a parameter to the method
//saveEvenNumbers().
package assignment4;
import java.util.*;
	
	class EvenNumbers {
		List<Integer> arraylist = new ArrayList<Integer>();

		public void saveEvenNum(int N) {
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) {
					arraylist.add(i);
				}
			}
			System.out.println(arraylist);
		}

		public void printEvenNumbers() {
			List<Integer> a2 = new ArrayList<Integer>();

			for (int i = 2; i < arraylist.size(); i++) {
				int y = arraylist.get(i) * 2;
				a2.add(y);
			}
			System.out.println(a2);

		}

	}

  class SaveEvenNumber{

		public void main(String[] args) {
			EvenNumbers s = new EvenNumbers();
			s.saveEvenNum(10);
			s.printEvenNumbers();
		}
	}