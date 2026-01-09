package polymorphismAssignment;

import java.time.temporal.ChronoField;

public class polymorphismGameCharacter {

	static abstract class Character {
		abstract void attack();
	}

	static class Warrior extends Character {
		void attack() {
			System.out.println("Warrior is attacking");
		}
	}

	static class Archer extends Character {
		void attack() {
			System.out.println("Archer is attacking");
		}
	}

	static class Mage extends Character {
		void attack() {
			System.out.println("Mage is attacking");
		}
	}

	public static void main(String[] args) {

		Character warriorCharacter = new Warrior();
		warriorCharacter.attack();
		Character archerCharacter = new Archer();
		archerCharacter.attack();
	}

}
