package polymorphismAssignment;

public class polymorphismDiscount {

	static abstract class Customer {
		abstract void calculateDiscount(int amount);
	}

	static class RegularCustomer extends Customer {
		void calculateDiscount(int amount) {
			System.out.println("Regular Customer will get " + amount * 0.2 + " rs of discount.");
		}
	}

	static class PremiumCustomer extends Customer {
		void calculateDiscount(int amount) {
			System.out.println("Premium Customer will get " + amount * 0.3 + " rs of discount.");
		}
	}

	static class VIPCustomer extends Customer {
		void calculateDiscount(int amount) {
			System.out.println("VIP Customer will get " + amount * 0.5 + " rs of discount.");
		}
	}

	public static void main(String[] args) {
		Customer regularCustomer = new RegularCustomer();
		regularCustomer.calculateDiscount(1500);

	}

}
