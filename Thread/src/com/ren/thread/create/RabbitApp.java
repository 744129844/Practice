package com.ren.thread.create;

public class RabbitApp {
	
	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		Tortoise t = new Tortoise();
		r.start();
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main-->"+i);
		}
	}

}
