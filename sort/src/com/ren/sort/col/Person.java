package com.ren.sort.col;

public class Person {
	private final String name;
	private final int handsome;
	public String getName() {
		return name;
	}
	public int getHandsome() {
		return handsome;
	}
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public Person() {
		name = null;
		handsome = 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名"+this.name+"|帅气指数"+this.handsome;
	}
	
	

}
