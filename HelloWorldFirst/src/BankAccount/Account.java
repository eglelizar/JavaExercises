package BankAccount;

public class Account {
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.setCustomerName("Elizabeth Razo");
		bank.deposit(100.0);
		bank.deposit(25.20);
		bank.withDraw(89.2);
	}

}
