package com.assessment2.q2.multithreading;

import java.util.Random;

public class ThreadRandom implements Runnable {
	Random random = new Random();

	int number;

	public void run() {
		number = random.nextInt(10) + 1;
	}

	int getNumber() {
		return number;
	}

}
