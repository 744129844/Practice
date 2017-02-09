package com.ren.thread.create;

public class StaticProxy {
	
	public static void main(String[] args) {
		You y = new You();
		WeddingCompany wd = new WeddingCompany(y);
		wd.marry();
	}

}

interface Marry{
	public abstract void marry();
}

class You implements Marry{

	@Override
	public void marry() {
		System.out.println("marry with 1");
		
	}
	
}

class WeddingCompany implements Marry{
	
	private Marry you;
	
	

	public WeddingCompany(Marry you) {
		super();
		this.you = you;
	}
	
	private void before(){
		System.out.println("house");
	}
	
	private void after(){
		System.out.println("rabbit");
	}

	@Override
	public void marry() {
		before();
		you.marry();
		after();
		
	}
	
}
