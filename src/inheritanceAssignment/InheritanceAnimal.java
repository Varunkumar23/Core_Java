package inheritanceAssignment;

public class InheritanceAnimal {

	static class Animal {
		void eat() {
			System.out.println("Animal is eating");
		}
	}

	static class Mammal extends Animal {
		void walk() {
			System.out.println("Mammal has 4 legs");
		}

	}

	static class Dog extends Mammal {
		void sound() {
			System.out.println("Dog sounds bow bow!");
		}
	}

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.walk();
		dog.sound();

	}

}
