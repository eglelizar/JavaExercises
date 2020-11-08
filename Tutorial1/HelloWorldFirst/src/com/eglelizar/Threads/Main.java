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
				try {
					anotherThread.join(2000);
					System.out.println("AnotherThread terminated, so I am runnin again");
				}catch(InterruptedException e)
				{
					System.out.println("I could not wait after all. I was interrupted");
				}
			}
			
		});
		
		myRunnableThread.start();
		//anotherThread.interrupt();
		
		System.out.println("Hello again from the main thread.");
				
	}

}
