package objectOrientedProgramming;

class Box {

}

class Bottle {

}

public class PasssingObjectsAsArguments {

	static class Box {

	}

	static class Bottle {

	}

	public static void main(String[] args) {
		Box b = new Box();
		printRef(b);

		Bottle b1 = new Bottle();
		printRef(b1);

	}

	public static void printRef(Box b) {
		System.out.println(b);
	}

	public static void printRef(Bottle b) {
		System.out.println(b);
	}

	
}
