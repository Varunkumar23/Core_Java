package objectOrientedProgramming;

public class IntroductionToOops {

	static class Human {
		String name;
		int age;

		String getName() {
			return name;
		}

		int getAge() {
			return age;
		}

	}

	public static void main(String[] args) {
		
		Human h1 = new Human();

		h1.name = "Varun Kumar";
		h1.age = 21;
		
		System.out.println(h1.name);
		System.out.println(h1.age);

	}

}
