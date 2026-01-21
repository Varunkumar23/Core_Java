package functionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int age;
	String name;

	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println("Hello Brother!");
	}
	
	public String toString() {
		return "Student Name: "+name+", Age: "+age;
	}
}

public class AnonymousClassExample2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student(22, "Varun"));
		list.add(new Student(19, "Aman"));
		list.add(new Student(221, "Rahul"));
		
		
// so here instead of writing a separate class to implement the comparator we are directly writing the implementation here 
		// this class has no name so this is called anonymous class 
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s2.age - s1.age;
			}
		});
		
		System.out.println(list);

	}

}
