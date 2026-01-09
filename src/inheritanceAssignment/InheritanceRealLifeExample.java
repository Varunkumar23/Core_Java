package inheritanceAssignment;

public class InheritanceRealLifeExample {

	static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	static class Teacher extends Person {
		String subject;
		double salary;

		Teacher(String name, int age, String subject, double salary) {
			super(name, age); // reuse Person code
			this.subject = subject;
			this.salary = salary;
		}

		void displayDetails() {
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Subject: " + subject);
			System.out.println("Salary: " + salary);
		}
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Varun", 30, "Mathematics", 45000);
		teacher.displayDetails();
	}
}
