package com.eglelizar.Threads;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello from the main thread.");
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("==Another Thread==");
		anotherThread.start();
		new Thread() {
			public void run() {
				System.out.println("hELLO FROM THE ANONYMOUS CLASS THREAD");
			}
		}.start();
		
		Thread myRunnableThread = new Thread(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("Hello from the anonymous class implementation of run()");
			}
			
		});
		
		myRunnableThread.start();
		//anotherThread.interrupt();
		
		System.out.println("Hello again from the main thread.");
				
	}

}
