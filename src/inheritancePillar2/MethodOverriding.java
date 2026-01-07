package inheritancePillar2;

public class MethodOverriding {

	static class Animal {
		void walk() {
			System.out.println("Animal walks on 4 legs");
		}

		void sound() {
			System.out.println("Animal Sounds");
		}
	}

	static class Dog extends Animal {

		void sound() {
			System.out.println("Bow Bow...");
		}

	}

	static class Cat extends Animal {

		void sound() {
			System.out.println("Meow Meow........");
		}
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		a.walk();

		Animal d = new Dog();
		d.sound();
		d.walk();

		Animal c = new Cat();
		c.sound();
		c.walk();

	}

}
