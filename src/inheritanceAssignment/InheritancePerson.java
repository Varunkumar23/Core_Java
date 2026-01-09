package inheritanceAssignment;

public class InheritancePerson {

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

	}

	static class Student extends Person {
		int rollNo;
		int marks;

		Student(String name, int age, int rollNo, int marks) {
			super(name, age);
			this.rollNo = rollNo;
			this.marks = marks;
		}
	}

	public static void main(String[] args) {

		Student student = new Student("Varun", 21, 10, 967);
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.rollNo);
		System.out.println(student.marks);

	}

}
