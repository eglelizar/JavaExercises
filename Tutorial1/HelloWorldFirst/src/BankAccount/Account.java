package BankAccount;

public class Account {
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.setCustomerName("Elizabeth Razo");
		bank.deposit(100.0);
		bank.deposit(25.20);  
		//TODO ALGO
		bank.withDraw(89.2);
		VIPPerson person1 = new VIPPerson();
		System.out.println(person1.getName());
		
		VIPPerson person2 = new VIPPerson("Bob", 25000.00);
		System.out.println(person2.getName());
		
		VIPPerson person3 = new VIPPerson("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
	} 
  
}
