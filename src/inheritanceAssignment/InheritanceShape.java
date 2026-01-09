package inheritanceAssignment;

public class InheritanceShape {

	abstract static class Shape {
		abstract void draw();
	}

	static class Circle extends Shape {
		void draw() {
			System.out.println("Drawing Circle!");
		}
	}

	static class Square extends Shape {
		void draw() {
			System.out.println("Drawing Square!");
		}
	}

	static class Rectangle extends Shape {
		void draw() {
			System.out.println("Drawing Rectangle!");
		}
	}

	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.draw();
		Shape s2 = new Square();
		s2.draw();
		Shape s3 = new Rectangle();
		s3.draw();

	}

}
