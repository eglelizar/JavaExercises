package com.eglelizar.Counter;

public class Countdown {
	private int i;
	private static String something ="";
	
	public void doCountdown() {		
		String color;		
		switch(Thread.currentThread().getName()) {
		case "Thread 1": 
			color = ThreadColor.ANSI_CYAN;
			break;
		case "Thread 2": 
			color = ThreadColor.ANSI_PURPLE;
			break;			
		default: 
			color = ThreadColor.ANSI_RED;
		}
		synchronized(something) {				
			for (i=10; i>0; i--) {
				System.out.println(color + Thread.currentThread().getName() + ": i = "+ i);
			}
		}
	}
}


