package JavaCollectionsFramework_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class customList {

	static class Student {
		String name;
		int age;

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String toString() {
			return "Student Name: " + name + "Student Age: " + age;
		}

		public boolean equals(Student s) {
			return this.name.equals(s.name) && this.age == s.age;
		}

	}

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Varun", 21));
		studentsList.add(new Student("Tharun", 19));
		studentsList.add(new Student("Hari", 21));
		studentsList.add(new Student("Lohith", 21));

		Student keyObject = new Student("Varun", 21);

		System.out.println(studentsList.contains(keyObject));

		// checking the obejcts in the list by downcasting the the object to student

		// To check the custom objects in the list
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the student name: ");
		String nameString = scanner.next();
		boolean found = false;

		ListIterator listIterator = studentsList.listIterator();
		while (listIterator.hasNext()) {
			Student tempStudent = (Student) listIterator.next();
			if (tempStudent.name.equals(nameString)) {
				found = true;
				System.out.println("Student exists");
				System.out.println("Student Name: " + tempStudent.name + " Student age: " + tempStudent.age);
			}
		}

		if (!found) {
			System.out.println("Student is not in the list");
		}

	}

}
