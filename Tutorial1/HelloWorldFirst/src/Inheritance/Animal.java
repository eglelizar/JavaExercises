package Inheritance;

public class Animal {
	private String name;
	private int size;
	private int weight;
	public Animal(String name, int size, int weight) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
	public void Walk() {
		System.out.println("Walking from animal");
	}
	
}
