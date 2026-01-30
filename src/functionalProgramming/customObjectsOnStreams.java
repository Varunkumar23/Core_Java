package functionalProgramming;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class customObjectsOnStreams {

	static class Student {
		private int id;
		private String name;

		Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public int getId() {
			return id;
		}

		public String toString() {
			return "Id: " + id + " Name: " + name;
		}

	}

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Varun"));
		studentList.add(new Student(2, "Tharun"));
		studentList.add(new Student(3, "Vishnu"));
		studentList.add(new Student(4, "Anushka"));

		studentList.stream().filter(s -> s.getName().startsWith("A")).forEach(System.out::println);

	}

}
