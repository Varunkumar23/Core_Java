package polymorphismAssignment;

public class polymorphismBankInterest {

	static class BankAccount {
		int calculateInterest(int amount, int tenure, int rate) {
			return 0;
		}
	}

	static class SavingsAccount extends BankAccount {
		int calculateInterest(int amount, int tenure, int rate) {
			return (amount * tenure * rate) / 100;
		}
	}

	static class FixedDepositAccount extends BankAccount {
		int calculateInterest(int amount, int tenure, int rate) {
			return (amount * tenure * (rate+3)) / 100;
		}
	}

	static class CurrentAccount extends BankAccount {
		int calculateInterest(int amount, int tenure, int rate) {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		BankAccount savingsAccount=new SavingsAccount();
		System.out.println(savingsAccount.calculateInterest(50000,2,8));
		
		
	}

}
