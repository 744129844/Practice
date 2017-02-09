package com.ren.thread.create;

public class Web12306 implements Runnable {
	
	private int num = 50;

	@Override
	public void run() {
		while(true){
			if(num<=0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"-->"+num--);
		}
		
	}
	
	public static void main(String[] args) {
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web, "a");
		Thread t2 = new Thread(web, "b");
		Thread t3 = new Thread(web, "c");
		t1.start();
		t2.start();
		t3.start();
	}

}
