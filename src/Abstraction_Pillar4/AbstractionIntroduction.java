package Abstraction_Pillar4;

public class AbstractionIntroduction {

	static abstract class Operations {

		abstract void calculate();

	}

	static class addition extends Operations {
		int a;
		int b;

		public addition(int a, int b) {
			this.a = a;
			this.b = b;
		}

		void calculate() {
			System.out.println(a + b);
		}
	}

	static class subtraction extends Operations {
		int a;
		int b;
		public subtraction(int a, int b) {
			this.a = a;
			this.b = b;
		}

		void calculate() {
			System.out.println(a - b);
		}
	}

	public static void main(String[] args) {
		Operations add = new addition(4, 5);
		add.calculate();
		Operations subOperations=new subtraction(5, 7);
		subOperations.calculate();

	}

}
