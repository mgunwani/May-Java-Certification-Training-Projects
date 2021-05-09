package objectorientedprogramming;

interface IManage {
	void openAccount();
	void closeAccount();
}

interface IBank {
	
	default void showMessage() {
		System.out.println("Welcome to ABC Bank!!");
	}
	static void message() {
		System.out.println("For any queries reach out to contact@abc.com!!");
	}
	void deposit();
	void withdraw();
	void balance();
}

class Saving implements IBank, IManage {

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

	@Override
	public void openAccount() {
		System.out.println("Opening Saving Account!!");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Saving Account!!");
		
	}
	
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		
		
		
		Saving saving = new Saving();
		saving.showMessage();
		saving.openAccount();
		saving.deposit();
		saving.withdraw();
		saving.balance();
		saving.closeAccount();
		
		IBank.message();
		
	}

}
