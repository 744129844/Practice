package com.ren.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Call {
	
	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ser = Executors.newFixedThreadPool(2);
		Race tortoise = new Race("wugui",1000);
		Race rabbit = new Race("tutu",500);
		Future<Integer> result1 = ser.submit(tortoise);
		Future<Integer> result2 = ser.submit(rabbit);
		Thread.sleep(2000);
		tortoise.setFlag(false);
		rabbit.setFlag(false);
		int num1 = result1.get();
		int num2 = result2.get();
		System.out.println("wugui-->"+num1);
		System.out.println("tutu-->"+num2);
		ser.shutdownNow();
	}

}

class Race implements Callable<Integer>{
	
	private String name;
	private long time;
	private boolean flag = true;
	private int step = 0;
	
	public Race() {
		// TODO Auto-generated constructor stub
	}
	
	public Race(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}
	
	@Override
	public Integer call() throws Exception {
		while(flag){
			Thread.sleep(time);
			step++;
		}
		return step;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	
	
	
}
