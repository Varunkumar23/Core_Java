package objectOrientedProgramming;

public class StaticMethods {
	// as m1 is a static method and present in same class as main so we can directly call the method
	public static void m1() {
		System.out.println("Static method executed by m1 method");
	}
	
	public static void main(String[] args) {
		m1();
		StaticMethods.m1(); //we have to use this where the method is in another class
	}
	

}
