package com.eglelizar.Concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static final String EOF = "EOF";
	
	public static void main(String[] args) {
		List<String> buffer = new ArrayList<String>();
		ReentrantLock bufferLock = new ReentrantLock();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW, bufferLock);
		MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
		MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
		executorService.execute(producer);
		executorService.execute(consumer1);
		executorService.execute(consumer2);
		
		Future<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception{
				System.out.println(ThreadColor.ANSI_PURPLE + "I'm being printed for the Callable calls");
				return "This is the callable result";
			}
		});
		
		try {
			System.out.println(future.get());			
		}catch(ExecutionException e) {
			System.out.println("Something went wrong");
		}catch (InterruptedException e) {
			System.out.println("Thread running the task was interrupted");
		}
		//new Thread(producer).start();
		//new Thread(consumer1).start();
		//new Thread(consumer2).start();
		
		executorService.shutdown();
	}

}
