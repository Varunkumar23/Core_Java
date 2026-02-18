package advanceJavaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	String firstName;
	String lastName;
	int age;
	int mobileNumber;
	int salary;

	public Employee(String firstName, String lastName, int age, int mobileNumber, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
	}

	public int compareTo(Employee e) {
		return this.firstName.compareTo(e.firstName);
	}
	
    public String toString() {
        return firstName+" "+lastName;
    }


}

public class CustomEmployeeObject {
	public static void main(String[] args) {
		List<Employee> employess = new ArrayList<>();
		employess.add(new Employee("Varun", "Kumar", 21, 100, 183));
		employess.add(new Employee("Tharun", "Kumar", 21, 100, 183));
		employess.add(new Employee("Arjun", "Kumar", 21, 100, 183));
		employess.add(new Employee("Sampath", "Kumar", 21, 100, 183));

		Collections.sort(employess);
		System.out.println(employess);

	}

}
