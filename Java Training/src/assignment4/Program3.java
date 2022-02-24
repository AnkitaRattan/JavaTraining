//Q3 Create an ArrayList which will be able to store only Strings.
//Create a printAll method which will print all the elements
//using an Iterator.
package assignment4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program3 {
	List<String> l = new ArrayList<String>();
	public void arraylist() {
	
	l.add("a");
	l.add("b");
	l.add("c");
	l.add("d");
	l.add("e");
	l.add("f");
	
	System.out.println(l);
	}
	
	public void printall() {
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

	public static void main(String[] args) {
		Program3 p = new Program3();
		p.arraylist();
		p.printall();
	
	}
}