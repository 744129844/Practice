package com.ren.gen01;

public class MyStudent<T> {
	
	private T javase;
	
	public MyStudent() {
		
	}
	
	public MyStudent(T javase) {
		this.javase = javase;
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
	
	

}
