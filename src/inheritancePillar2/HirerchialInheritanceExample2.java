package inheritancePillar2;

public class HirerchialInheritanceExample2 {

	static class BankAccount {
		void getInterestRate() {
			System.out.println("Interest Rate usally lies between 4-8");
		}
	}

	static class CurrectAccount extends BankAccount {
		void getInterestRate() {
			System.out.println("Interest Rate is 2%");
		}

		void overdraft() {
			System.out.println("Overdraft allowed");
		}

	}

	static class SavingsAccount extends BankAccount {
		void getInterestRate() {
			System.out.println("Interest Rate is 8%");
		}

		void addInterest() {
			System.out.println("Interest added");
		}
	}

	public static void main(String[] args) {
		BankAccount currentAccount=new CurrectAccount();
		BankAccount savingsAccount=new SavingsAccount();
		
		currentAccount.getInterestRate();
		savingsAccount.getInterestRate();
		
		

	}

}
