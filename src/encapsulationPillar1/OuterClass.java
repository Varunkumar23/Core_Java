package encapsulationPillar1;

public class OuterClass {
	static class InnerClass {
		static void display() {
			System.out.println("Static Method");

		}

		void test() {
			System.out.println("Non-static Method");
		}
	
	
		}

	public static void main(String[] args) {

		// this is for when the class is static
		// As display is a static method we can directly call thhe method
//		OuterClass.InnerClass.display();

		// And test is a non static we have to create a object to access the test method
//		OuterClass.InnerClass e1 = new OuterClass.InnerClass();
//		e1.test();
		
		InnerClass i1=new InnerClass();
		i1.display();
		i1.test();
		
		
		
		
	}
}
