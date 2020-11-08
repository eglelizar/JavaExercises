package BankAccount;

public class VIPPerson {
	private String name;
	private double creditLine;
	private String emailAddress;
	public VIPPerson(String name, double creditLine, String emailAddress) {
		super();
		this.name = name;
		this.creditLine = creditLine;
		this.emailAddress = emailAddress;
	}
	public VIPPerson() {
		this("Default name", 50000.00, "default@email.com");
	}
	
	public VIPPerson(String name, double creditLine) {
		this(name, creditLine, "unknown@email.com");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
