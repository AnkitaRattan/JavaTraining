//Q2 Create an Employee class with the related attributes and
//behaviours. Create one more class EmployeeDB which has the
//following methods.
package assignment4;	
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Em {
	public static void main(String[] args) {
		EmployeeDB j = new EmployeeDB();
		Employee F = new Employee(12, "Ankita", 122);
		Employee Fe = new Employee(1222, "Ankita Rattan", 1028);
		j.addEmployee(F);
		j.addEmployee(Fe);
		j.removeEmployee(12);
		j.showpayslip(12);
		j.addEmployee(Fe);

	}
}

class Employee {
	String name;
	int eCode;
	int salary;

	public Employee(int eCode, String name, int salary) {

		this.eCode = eCode;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return eCode;

	}

}

class EmployeeDB {
	List<Employee> al = new ArrayList<>();


	boolean addEmployee(Employee e) {

		al.add(e);

		Iterator<Employee> iter = al.iterator();

		while (iter.hasNext()) {
			Employee t = (Employee) iter.next();
			System.out.println(t.eCode);
			System.out.println(t.name);
			System.out.println(t.salary);
		}

		return true;
	}

	boolean removeEmployee(int eCode) {
		
		Iterator<Employee> iter = al.iterator();

		while (iter.hasNext()) {
			Employee e = iter.next();
			if (e.getId() == eCode) {
				iter.remove();
				System.out.println("Removed");
				while (iter.hasNext()) {
					Employee t = (Employee) iter.next();
					System.out.println(t.eCode);
					System.out.println(t.name);
					System.out.println(t.salary);
				}
			}
			else {
				System.out.println("Not found");
			}
		}
		return true;
	}

	void showpayslip(int eCode) {
		Iterator<Employee> iter = al.iterator();
		while (iter.hasNext()) {
			Employee e = iter.next();
			if (e.getId() == eCode) {
				System.out.println("Salary is " + e.salary);
			}
		}
	}
}