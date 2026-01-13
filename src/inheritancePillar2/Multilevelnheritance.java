package inheritancePillar2;

public class Multilevelnheritance {

	static class Person {
		String name;
	}

	static class Employee extends Person {
		int empId;
	}

	static class Manager extends Employee {
		void manage() {
			System.out.println(name + " is managing the team");
		}
	}

	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.name="Varun Kumar";
		manager.empId=123;
		manager.manage();
	}

}
