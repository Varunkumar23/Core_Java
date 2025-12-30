package objectOrientedProgramming;

public class StaticInitializers {
	static {
		System.out.println("Hiii iam from 1st static block");
	}

	public static void main(String[] args) {
		System.out.println("Hiiii iam from main method");
	}

	static {
		System.out.println("Hiii iam from 2nd static block");
	}
}
