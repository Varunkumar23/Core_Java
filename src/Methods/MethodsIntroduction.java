package Methods;

public class MethodsIntroduction {

	public static void main(String[] args) {
	System.out.println(add(140,3));
//		circleArea();
//		TriangleArea();
//		SquareArea();

	}

	public static void print() {
		System.out.println("Hello from print function");
	}
	
// Non-Parameterized Functions

//	static void circleArea() {
//		int r = 5;
//		int ans = (int) 3.14 * r * r;
//		System.out.println("Area of the circle is : " + ans);
//	}
//
//	static void TriangleArea() {
//		int b = 5;
//		int h = 23;
//		float ans = 0.5f * b * h;
//		System.out.println("Area of the Triangle is : " + ans);
//	}
//
//	static void SquareArea() {
//		int s = 5;
//		int ans = s * s;
//		System.out.println("Area of the Square is : " + ans);
//	}
	
// Argument Based Functions
	
public static int add(int a,int b) {
	return a+b;
}

}
