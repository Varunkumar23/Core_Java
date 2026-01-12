package exceptionHandling;

public class BankAccountExceptionHandling {

	static class BankAccount {
		private int accNumber;
		private int balance;

		public BankAccount(int accNumber, int balance) {
			if (balance < 0) {
				throw new IllegalArgumentException("Balance must be positive");
			}
			this.accNumber = accNumber;
			this.balance = balance;
		}

		public void withdraw(int amount) {
			if (amount <= 0) {
				throw new IllegalArgumentException("Please enter the valid amount to wirthdraw");
			}

			if (amount > balance) {
				throw new IllegalStateException("Insufficient Balance");
			}

			balance -= amount;
			System.out.println("Withdrawl Successful");
		}

		public int getAccoutNumber() {
			return accNumber;
		}

		public void deposit(int amount) {
			if (amount <= 0) {
				throw new IllegalArgumentException("Please enter the valid amount to deposit");
			}

			balance += amount;
			System.out.println("Deposit Successful");

		}

	}

	public static void main(String[] args) {

		BankAccount sbiAccount = new BankAccount(1234, 5000);
		try {
			sbiAccount.deposit(1000);
			sbiAccount.withdraw(-3);
		} catch (IllegalArgumentException e) {
			System.out.println("Input Error: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("Business Error: " + e.getMessage());
		} finally {
			System.out.println("Transaction attempt completed");
		}

	}

}
