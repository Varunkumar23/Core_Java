package JavaCollectionsFramework_SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class studentComparator {

	static class Student {
		int id;
		String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String toString() {
			return "Id: " + id + " Name: " + name;
		}

	}

	static class StudentComparator implements Comparator<Student> {

		public int compare(Student s1, Student s2) {
			return s2.id - s1.id;
		}

	}

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new StudentComparator());

		set.add(new Student(1, "varun"));
		set.add(new Student(10, "tharun"));
		set.add(new Student(3, "hari"));
		set.add(new Student(4, "adithya"));

		System.out.println(set);

	}

}
