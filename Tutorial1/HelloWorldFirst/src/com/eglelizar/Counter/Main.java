package com.eglelizar.Counter;

public class Main {

	public static void main(String[] args) {
		Countdown countdown = new Countdown();
		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread 1");
		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread 2");
		CountdownThread t3 = new CountdownThread(countdown);
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
