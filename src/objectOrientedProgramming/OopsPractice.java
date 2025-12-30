package objectOrientedProgramming;

public class OopsPractice {
	static class Student {
		String name;
		int age;
		static String college = "LPU";

		public Student() {

		}

		public Student(String name) {
			this();
			this.name = name;
		}

		public Student(String name, int age) {
			this(name);
			this.age = age;
		}

	}

	public static void main(String[] args) {
		Student s1 = new Student("Varun Kumar", 21);
		Student.college = "LPU University";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(Student.college);

		Student s2 = new Student("Vishnu Kanth");
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.college);
	}
}
