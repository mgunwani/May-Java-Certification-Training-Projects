package objectorientedprogramming;

abstract class ManageAccount {
	
	public abstract void openAccount();
	public abstract void closeAccount();
}

abstract class BankAccount extends ManageAccount {
	
	public static void showMessage() {
		System.out.println("Welcome to ABC Account!!");
	}
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balance();
	
}

class SavingAccount extends BankAccount {
	
	@Override
	public void openAccount() {
		System.out.println("Opening Saving Account!!");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Saving Account!!");
		
	}

	public void calculateTax() {
		System.out.println("Calculating Tax on Saving Account!!");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit in Saving Account!!");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Saving Account!!");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account!!");
	}
	
}

class CurrentAccount extends BankAccount {

	
	@Override
	public void openAccount() {
		System.out.println("Opening Current Account!!");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Current Account!!");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit in Current Account!!");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Current Account!!");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in Current Account");
		
	}
	
}

public class AbstractClassExample {
	
	public static void main(String[] args) {
		
		BankAccount.showMessage();
		
		System.out.println("-----------------------------------------");
		
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount();
		savingAccount.deposit();
		savingAccount.withdraw();
		savingAccount.balance();
		savingAccount.calculateTax();
		savingAccount.closeAccount();
		
		System.out.println("-----------------------------------------");
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.openAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.balance();
		currentAccount.closeAccount();
		
	}

}
