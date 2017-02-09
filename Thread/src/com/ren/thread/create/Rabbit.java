package com.ren.thread.create;

public class Rabbit extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("兔子-->"+i);
		}
	}

}

class Tortoise extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("乌龟-->"+i);
		}
	}

}
