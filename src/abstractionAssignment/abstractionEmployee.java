package abstractionAssignment;

public class abstractionEmployee {

	static abstract class Employee {
		abstract double calculateSalary(int exerience);

		public static void displayDetails() {
			System.out.println("Displaying the employee salary: ");
		}
	}

	static class FullTimeEmployee extends Employee {
		double calculateSalary(int experience) {
			return experience * 3 + 30000;
		}

	}

	static class PartTimeEmployee extends Employee {
		double calculateSalary(int experience) {
			return experience * 1 + 10000;
		}

	}

	public static void main(String[] args) {
		Employee fullTimEmployee = new FullTimeEmployee();

		Employee.displayDetails();
		System.out.println(fullTimEmployee.calculateSalary(5));

		Employee partTimEmployee = new PartTimeEmployee();
		Employee.displayDetails();
		System.out.println(partTimEmployee.calculateSalary(5));
	}

}
