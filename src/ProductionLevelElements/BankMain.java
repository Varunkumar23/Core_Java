package ProductionLevelElements;

public class BankMain {

	public static void main(String[] args) {
		BankAccountHolderDetails user1 = new BankAccountHolderDetails(12345, "Varun Kumar", 50000);
		user1.deposit(300);
		user1.withdraw(100);

		System.out.println(user1.getAccountNumber());
		System.out.println(user1.getAccountHolderName());
		System.out.println(user1.getAvailableBalance());
		System.out.println(user1.getAccountSummary());
	}

}
