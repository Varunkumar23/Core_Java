package inheritanceAssignment;

public class InheritanceAccessModifiers {

	static class Parent {
		protected String name;
		protected int age;

		Parent(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	static class Child extends Parent {

		Child(String name, int age) {
			super(name, age);
		}

		void display() {
			//direct access
			System.out.println(name);
			System.out.println(age);
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
		}
	}

	public static void main(String[] args) {
		Child child = new Child("Varun", 21);
		child.display();
	}
}
