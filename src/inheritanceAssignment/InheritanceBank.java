package inheritanceAssignment;

public class InheritanceBank {

	static class Bank {
		double getInterest(double amount, double tenure) {
			return (amount * tenure * 1) / 100;
		}
	}

	static class SBI extends Bank {
		double getInterest(double amount, double tenure) {
			return (amount * tenure * 3) / 100;
		}
	}

	static class HDFC extends Bank {
		double getInterest(double amount, double tenure) {
			return (amount * tenure * 5) / 100;
		}
	}

	public static void main(String[] args) {

		Bank sbiBank = new SBI();
		System.out.println(sbiBank.getInterest(50000, 2));

	}

}
