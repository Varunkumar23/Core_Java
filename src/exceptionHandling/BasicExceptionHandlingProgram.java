package exceptionHandling;

public class BasicExceptionHandlingProgram {

	public static void main(String[] args) {
		System.out.println("Program execution starts");

		int a = 10;
		int b = 0;
		int result = 0;
		// so here by writing the code which causes the exception into try block and
		// saying what to do when that exception arises in catch block
		// by this way we get exceptions but without stopping the execution of the
		// program

		try {

			result = a / b;
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		
		//so we will write final block to wheather the exception araises or not but it will execute no matter what
		finally {
			System.out.println("Final block");
		}
		System.out.println("Output is: " + result);
		System.out.println("Program execution ends");
	}

}
