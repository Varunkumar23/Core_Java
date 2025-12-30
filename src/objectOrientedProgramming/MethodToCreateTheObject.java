package objectOrientedProgramming;

public class MethodToCreateTheObject {

	static class Box {
		int length;

		Box() {

		}

		Box(int length) {
			this.length = length;
		}

		public static Box createObject() {
			return new Box();     
		}

		public static Box createObject(int length) {
			return new Box(length);
		}
	}

	public static void main(String[] args) {
		Box b1 = Box.createObject();
		printRef(b1);
		Box b2 = Box.createObject(89);
		printRef(b2);

	}

	public static void printRef(Box b) {
		System.out.println(b);
	}

}
