package com.eglelizar.Messages;

import java.util.Random;

public class Writer implements Runnable{
	private Message message;
	public Writer(Message message) {
		this.message = message;
	}
	public void run() {
		String messages[] = {
				"Humpty Dumpty sat on a wall",
				"Humpty Dumpty had a great fall",
				"Something #1",
				"Something #2",
				"Something #3",
				"Something #4" 			
		};
		Random random = new Random();
		for (int i=0; i<messages.length; i++) {
			this.message.write(messages[i]);
			try {

				Thread.sleep(random.nextInt(2000));
			}
			catch(InterruptedException e) {
				System.out.println("Thread got into interrrupted exception");
			}						
		}
		message.write("Finished");
	}
	
}
