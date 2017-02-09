package com.ren.thread.syn;



public class SynDemo01 {
	
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

class Web12306 implements Runnable {
	
	private int num = 50;
	private boolean flag = true;

	@Override
	public void run() {
		while(flag){
			test06();
		}
		
	}
	
	public void test06(){
		
		if(num<=0){
			flag = false;
			return;
		}
		synchronized((Integer)num){
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
		}
	}
	
	public void test05(){
		synchronized((Integer)num){
		if(num<=0){
			flag = false;
			return;
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
		}
	}
	
	public void test04(){
		synchronized(this){
		if(num<=0){
			flag = false;
			return;
		}
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
	}
	
	public void test03(){
		synchronized(this){
		if(num<=0){
			flag = false;
			return;
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
		}
	}
	
	public synchronized void test02(){
		if(num<=0){
			flag = false;
			return;
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
	}
	
	public void test01(){
		if(num<=0){
			flag = false;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+num--);
	}
}