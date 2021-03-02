package com.assessment2.q2.multithreading;

public class ThreadRandomDriver {

	public static void main(String args[]) throws InterruptedException {

		ThreadRandom randomThread1 = new ThreadRandom();
		ThreadRandom randomThread2 = new ThreadRandom();
		ThreadRandom randomThread3 = new ThreadRandom();
		ThreadRandom randomThread4 = new ThreadRandom();
		ThreadRandom randomThread5 = new ThreadRandom();
		
		
		Thread thread1 = new Thread(randomThread1);
		Thread thread2 = new Thread(randomThread2);
		Thread thread3 = new Thread(randomThread3);
		Thread thread4 = new Thread(randomThread4);
		Thread thread5 = new Thread(randomThread5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();

		int total = 0;

		total = total + randomThread1.getNumber();
		total = total + randomThread2.getNumber();
		total = total + randomThread3.getNumber();
		total = total + randomThread4.getNumber();
		total = total + randomThread5.getNumber();

		System.out.println("Random Thread 1: " +randomThread1.getNumber());
	    System.out.println("Random Thread 2: " + randomThread2.getNumber());
	    System.out.println("Random Thread 3: " + randomThread3.getNumber());
	    System.out.println("Random Thread 4: " + randomThread4.getNumber());
	    System.out.println("Random Thread 5: " +randomThread5.getNumber());
	    
		System.out.println("Total: " + total);

	}

}
