package com.ren.thread.info;

public class InfoDemo01 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it,"挨踢");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());
		proxy.start();
		System.out.println(proxy.isAlive());
		Thread.sleep(20);
		it.stop();
		Thread.sleep(20);
		System.out.println(proxy.isAlive());
	}

}
