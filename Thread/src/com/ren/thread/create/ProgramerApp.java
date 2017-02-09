package com.ren.thread.create;

public class ProgramerApp {
	
	public static void main(String[] args) {
		Programer p = new Programer();
		Thread t = new Thread(p);
		t.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("b"+i);
		}
	}

}
