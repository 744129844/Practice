package com.ren.thread.syn;

public class SynDemo03 {
	
	public static void main(String[] args) {
		
		Object g = new Object();
		Object m = new Object();
		
		Test t = new Test(g,m);
		Test2 t2 = new Test2(g,m);
		Thread proxy = new Thread(t);
		Thread proxy2 = new Thread(t2);
		proxy.start();
		proxy2.start();
		
	}

}

class Test implements Runnable {
	Object goods = new Object();
	Object money = new Object();
	
	
	public Test(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}
	public void run() {
		while(true){
			test();
		}
	}
	public void test(){
		synchronized (goods) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (money) {
				
			}
		}
		System.out.println("haha");
	}
}

class Test2 implements Runnable {
	Object goods;
	Object money;
	
	
	
	public Test2(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}
	public void run() {
		while(true){
			test();
		}
	}
	public void test(){
		synchronized (money) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (goods) {
				
			}
		}
		System.out.println("haha");
	}
}