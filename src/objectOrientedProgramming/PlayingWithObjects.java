package objectOrientedProgramming;

public class PlayingWithObjects {
	
	static class Animal{
		String name;
		
		public Animal(String name) {
			this.name=name;
		}
	}

	public static void main(String[] args) {
		
		// so here we are copying an object address into another variable of same type

		Animal a1=new Animal("Dog");
		
		Animal a2=a1;
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		a2.name="Vishnu";
		
		System.out.println(a1.name);
		System.out.println(a2.name);
	}

}
