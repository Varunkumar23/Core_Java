package functionalProgramming;

public class AnonymousClass {

	static class Student {
		String name;

		Student(String name) {
			this.name = name;
		}

		public void display() {
			System.out.println("Hello Brother!");
		}
	}

	public static void main(String[] args) {
		
		//instead of creating a new class to override the display method we can directly override this method here itself
		// this is class anonymous class because it has no name
		Student s1 = new Student("Varun") {
			public void display() {
				System.out.println("Hello Everyone......");
			}
		};

		s1.display();

	}

}
