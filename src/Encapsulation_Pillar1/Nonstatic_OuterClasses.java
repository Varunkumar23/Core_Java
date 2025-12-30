package Encapsulation_Pillar1;

public class Nonstatic_OuterClasses {

	class InnerClass {

		void test() {
			System.out.println("Non static Method");
		}
	}

	public static void main(String[] args) {

		// so in this case we have to create the object of outer class
		// and access the inner class by the outer object and then create the object for
		// inner class
		// the we can access the methods inside the inside non static class
		Nonstatic_OuterClasses o1 = new Nonstatic_OuterClasses();
		InnerClass i1 = o1.new InnerClass();
		i1.test();

	}

}
