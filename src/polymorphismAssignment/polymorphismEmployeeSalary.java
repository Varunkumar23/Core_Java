package polymorphismAssignment;

public class polymorphismEmployeeSalary {

	static class Employee {
		double calculateSalary() {
			return 0;
		}
	}

	static class Developer extends Employee {
		private int salary;
		private int bonus;

		Developer(int salary, int bonus) {
			this.salary = salary;
			this.bonus = bonus;
		}

		double calculateSalary() {
			return salary + bonus;
		}
	}

	static class HR extends Employee {
		private int salary;
		private int bonus;
		private int extraPay;

		HR(int salary, int bonus, int extraPay) {
			this.salary = salary;
			this.bonus = bonus;
			this.extraPay = extraPay;
		}

		double calculateSalary() {
			return salary + bonus + extraPay;
		}
	}

	static class Intern extends Employee {
		private int salary;
		private int foodCharges;

		Intern(int salary, int foodCharges) {
			this.salary = salary;
			this.foodCharges = foodCharges;
		}

		double calculateSalary() {
			return salary - foodCharges;
		}
	}

	public static void main(String[] args) {

		Employee developer = new Developer(1900, 145);
		System.out.println(developer.calculateSalary());
		Employee hr = new HR(123, 120, 1234);
		System.out.println(hr.calculateSalary());

	}

}
