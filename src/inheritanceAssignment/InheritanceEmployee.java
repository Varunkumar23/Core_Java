package inheritanceAssignment;

public class InheritanceEmployee {

	static class Employee {
		String name;
		double salary;

		public Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}

	}

	static class Manager extends Employee {
		String department;

		public Manager(String name, double salary, String department) {
			super(name, salary);
			this.department = department;
		}
	}

	public static void main(String[] args) {

		Manager manager = new Manager("Varun Kumar", 500000, "Development");
		System.out.println(manager.name);
		System.out.println(manager.salary);
		System.out.println(manager.department);

	}

}
