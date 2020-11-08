package BankAccount;

public class BankAccount {
	private int number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public BankAccount() {
	}
	public BankAccount(String phoneNumber, double balance, String customerName, String customerEmailAddress)
	{
		this.phoneNumber = phoneNumber;
		this.balance= balance;
		this.customerName = customerName;
	}
	
	public BankAccount(String customerName, double balance) {
		super();
		this.balance = balance;
		this.customerName = customerName;
	}
	public int getNumber(){
		return this.number;
	}
	public void setNumber(int value) {
		this.number = value;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double value) {
		this.balance = value;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	public void setCustomerName(String value) {
		this.customerName = value;
	}
	public void deposit(double fund) {
		this.balance += fund;
		System.out.println("Deposit of " +  fund + " balance " + this.balance);
	}
	public void withDraw(double fund) {
		double applyingOperation = this.balance - fund;
		if (applyingOperation>=0) {
			this.balance-= fund;
			System.out.println("WithDraw of "+ fund + ", balance" + this.balance);
		}
		else {
			System.out.println("Operation not applied because there are no enough funds, balance " + this.balance);
		}
	}
}
