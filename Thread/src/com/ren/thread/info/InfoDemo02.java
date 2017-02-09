package com.ren.thread.info;

public class InfoDemo02 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread it1 = new MyThread();
		Thread p1 = new Thread(it1,"挨踢1-->");
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2,"挨踢2-->");
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();
		
		Thread.sleep(20);
		it1.stop();
		it2.stop();
	}
	
}
