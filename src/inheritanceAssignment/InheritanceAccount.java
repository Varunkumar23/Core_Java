package inheritanceAssignment;

public class InheritanceAccount {

	static class Account {
		int accNum;

		public Account(int accNum) {
			this.accNum = accNum;
		}
	}

	static class SavingsAccount extends Account {
		int interestRate;

		public SavingsAccount(int accNum, int interestRate) {
			super(accNum);
			this.interestRate = interestRate;
		}
	}

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount(123, 5);
		System.out.println(savingsAccount.accNum);
		System.out.println(savingsAccount.interestRate);
	}

}
