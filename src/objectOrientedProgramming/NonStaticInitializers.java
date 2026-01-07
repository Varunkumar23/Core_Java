package objectOrientedProgramming;

public class NonStaticInitializers {
	static class Demo {
		int a = 10; // single line non-static initializers

		// multi line non-static initializers
		{
			System.out.println("Non-static block");
		}
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1);
		
	}
}
