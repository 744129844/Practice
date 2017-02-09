package com.ren.thread.create;

public class Programer implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("a"+i);
		}
	}

}
