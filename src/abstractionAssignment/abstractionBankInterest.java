package abstractionAssignment;

public class abstractionBankInterest {

	static abstract class Bank {

		int balance;

		abstract double calculateInterest(double amount, double tenure);

		void deposit(int amount) {
			if (amount <= 0) {
				System.out.println("Invalid amount");
				return;
			}
			balance += amount;

		}

		void withdraw(int amount) {
			if (amount <= 0 || amount > balance) {
				System.out.println("Invalid amount");
				return;
			}
			balance -= amount;

		}
	}

	static class SavingsAccount extends Bank {
		double calculateInterest(double amount, double tenure) {
			return (amount * tenure * 3) / 100;
		}

	}

	static class CurrentAccount extends Bank {
		double calculateInterest(double amount, double tenure) {
			return 0;
		}

	}

	public static void main(String[] args) {
		Bank savingsBank = new SavingsAccount();
		savingsBank.deposit(1000);
		savingsBank.withdraw(990);
		System.out.println(savingsBank.balance);

		System.out.println(savingsBank.calculateInterest(100000, 5));

	}

}
