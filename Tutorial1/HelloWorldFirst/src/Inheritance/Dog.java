package Inheritance;

public class Dog extends Animal {
	private int eyes;
	private int mouth;
	private int legs;
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public Dog(String name, int size, int weight, int eyes, int mouth, int legs) {
		super(name, size, weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Walk() {
		System.out.println("Walking from Dog");
		// TODO Auto-generated method stub
		super.Walk();
	}
	

}
