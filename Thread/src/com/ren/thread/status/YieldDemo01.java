package com.ren.thread.status;

public class YieldDemo01 extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		YieldDemo01 yd = new YieldDemo01();
		Thread t = new Thread(yd);
		t.start();
		for (int i = 0; i < 100; i++) {
			if(0==i%20){
				Thread.yield();
			}
			System.out.println("main..."+i);
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("yield..."+i);
		}
	}

}
