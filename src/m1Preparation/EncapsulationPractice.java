package m1Preparation;

class BankAccount {
	private final int accNumber;
	private int balance;

	private static final int MINIMUM_BALANCE = 1000;

	public BankAccount(int accNumber, int balance) {

		if (balance <= 0 || balance < MINIMUM_BALANCE) {
			throw new IllegalArgumentException("Please enter the valid balance amount");
		}
		this.accNumber = accNumber;
		this.balance = balance;

		System.out.println("Account successfully created.");
	}

	public void withdraw(int amount) {
		if (amount <= 0 || amount > (balance - MINIMUM_BALANCE)) {
			throw new IllegalArgumentException("Please enter the valid amount to withdraw.");
		}

		balance = balance - amount;
	}

	public void deposit(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Please enter the valid amount to deposit.");
		}

		balance = balance + amount;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public int getBalance() {
		return balance-MINIMUM_BALANCE;

	}

}

public class EncapsulationPractice {

	public static void main(String[] args) {

	}

}
