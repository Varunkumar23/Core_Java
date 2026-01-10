package isARelationShip;


public class IsARelationShipImplementation {

	static class Animal {
		public void walk() {
			System.out.println("Animal walks on 4 legs");
		}

		public void sound() {
			System.out.println("Animal eats");
		}
	}

	static class Dog extends Animal {
		public void sound() {
			System.out.println("Bow Bow!");
		}

	}

	static class Cat extends Animal {
		public void sound() {
			System.out.println("Meow Meow!");
		}
	}

	// here dog is a animal
	// cat is a animal

	public static void main(String[] args) {
		
	}

}
