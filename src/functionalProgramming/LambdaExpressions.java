package functionalProgramming;

public class LambdaExpressions {

	// Funtional interface because it only contains one abstract method
	interface A {
		void test();
	}

	interface B {
		int add(int a, int b);
	}

	public static void main(String[] args) {

		// introduced from java 8
		// as java is code heavy lambda expressions has introduced to reduce the code
		// instead of implementing the method in a child class we can directly write
		// code for it in the main class without any extra
		// less code, more optimized
		// we can directly access the method using the interface reference variable that
		// we have created in main method

		// this implementation is called anonymous methods also because it has no name

		A a = () -> {
			System.out.println("Hello testing is started");
		};
		a.test();

//		B b = (x, y) -> {
//			return x + y;
//		};

		// we can write like this also
		B b = (x, y) -> x + y;

		System.out.println(b.add(67, 10));

	}

}
