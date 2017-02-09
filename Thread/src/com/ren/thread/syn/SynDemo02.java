package com.ren.thread.syn;

public class SynDemo02 {
	
	public static void main(String[] args) {
		
		JvmThread t1 = new JvmThread(100);
		JvmThread t2 = new JvmThread(500);
		t1.start();
		t2.start();
	}

}

class JvmThread extends Thread{
	private long time;
	
	public JvmThread(long time) {
		super();
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--->"+Jvm.getInsrance(time));
	}
}

class Jvm{
	private static Jvm instance = null;
	
	private Jvm(){
		
	}

	public static Jvm getInsrance(long time) {
		if(null==instance){
		synchronized (Jvm.class) {
		if(null==instance){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Jvm(); 
		}
		}
		}
		return instance;
	}
	
	public static Jvm getInsrance3(long time) {
		synchronized (Jvm.class) {
		if(null==instance){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		}
		return instance;
	}
	
	public static synchronized Jvm getInsrance2(long time) {
		if(null==instance){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	public static Jvm getInsrance1(long time) {
		if(null==instance){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}

	public void setInsrance(Jvm insrance) {
		this.instance = insrance;
	}
	
	
}
