package objectOrientedProgramming;

public class nonStaticMethods {
	static class Box {
		int length;
		int breadth;

		Box(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;

		}

		int getArea() {
			return length * breadth;
		}
	}

	public static void main(String[] args) {
		Box b1 = new Box(4, 150);

		System.out.println(b1.getArea());
	}
}
