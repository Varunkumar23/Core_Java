package inheritancePillar2;

public class HierarchialInheritance {

	static abstract class Shape {
		abstract double area();
	}

	static class Triangle extends Shape {
		double base;
		double height;

		Triangle(double base, double height) {
			this.base = base;
			this.height = height;
		}

		double area() {
			return 1 / 2 * base * height;
		}

	}

	static class Circle extends Shape {
		double radius;

		Circle(double radius) {
			this.radius = radius;
		}

		double area() {
			return 3 * 14 * radius * radius;
		}

	}

	static class Square extends Shape {
		double side;

		Square(double side) {
			this.side = side;
		}

		double area() {
			return side * side;
		}

	}

	public static void main(String[] args) {

	}

}
