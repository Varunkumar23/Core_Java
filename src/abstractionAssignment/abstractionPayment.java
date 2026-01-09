package abstractionAssignment;

public class abstractionPayment {

	static abstract class Payment {
		abstract void processPayment(double amount);

		public void printReceipt() {
			System.out.println("Reciept Printed");
		}
	}

	static class UPI extends Payment {
		void processPayment(double amount) {

			System.out.println("Received " + amount + " on UPI");
		}
	}

	static class DebitCard extends Payment {
		void processPayment(double amount) {

			System.out.println("Received " + amount + " on DebitCard");
		}
	}

	public static void main(String[] args) {
		Payment upiPayment = new UPI();
		upiPayment.processPayment(100);
		upiPayment.printReceipt();

		Payment dePayment = new DebitCard();
		dePayment.processPayment(234);
		dePayment.printReceipt();

	}

}
