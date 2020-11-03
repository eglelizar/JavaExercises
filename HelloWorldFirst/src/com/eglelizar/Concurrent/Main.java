package com.eglelizar.Concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static final String EOF = "EOF";
	
	public static void main(String[] args) {
		List<String> buffer = new ArrayList<String>();
		ReentrantLock bufferLock = new ReentrantLock();
		MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW, bufferLock);
		MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
		MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();
	}

}
