package com.eglelizar.Concurrent;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static com.eglelizar.Concurrent.Main.EOF;

public class MyProducer implements Runnable {
	
	private List<String> buffer;
	private String color;
	ReentrantLock bufferLock = new ReentrantLock();
	
	public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}
	
	public void run() {
		Random random = new Random();
		String[] nums = {"1", "2", "3", "4", "5"};
		for (String num: nums) {
			try {
				System.out.println(color + "Adding..."+num);
				bufferLock.lock();
				try {
					buffer.add(num);
				}
				finally {
					bufferLock.unlock();					
				}				
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Producer was interrupted");
			}
		}
		System.out.println(color + "Adding EOF and exiting");
		bufferLock.lock();
		try {
			buffer.add(EOF);			
		}
		finally {
			bufferLock.unlock();
		}
	}
	
}
