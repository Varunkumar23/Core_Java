package polymorphismAssignment;

public class polymorphismPayment {

	static abstract class Payment {
		abstract void pay();
	}

	static class UPI extends Payment {
		void pay() {
			System.out.println("UPI Payment!");
		}
	}

	static class DebitCard extends Payment {
		void pay() {
			System.out.println("Debit card payment");
		}
	}

	static class CreditCard extends Payment {
		void pay() {
			System.out.println("Credit card payment");
		}
	}

	public static void main(String[] args) {
		Payment payment1 = new UPI();
		payment1.pay();
		Payment payment2=new DebitCard();
		payment2.pay();
	}

}
