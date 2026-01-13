package inheritancePillar2;

public class SingleLevelInheritance {
	
	static class Employee{
		int empId;
		String name;
		
		
		
		void work() {
			System.out.println("Employee is working");
		}
	}
	
	static class Developer extends Employee{
		String programmingLanguage;
		
		void code() {
			System.out.println("Developer used language: "+programmingLanguage);
		}
	}

	public static void main(String[] args) {
		
		Developer developer=new Developer();
		developer.empId=1;
		developer.name="Varun";
		developer.programmingLanguage="Java";
		
		developer.work();
		developer.code();
	}

}
