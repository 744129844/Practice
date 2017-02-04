package com.ren.gen02;

public class MyStudent<T1,T2> {
	
	private T1 i;
	private T2 j;
	
	public MyStudent() {
		
	}

	public MyStudent(T1 i, T2 j) {
		super();
		this.i = i;
		this.j = j;
	}

	public T1 getI() {
		return i;
	}

	public void setI(T1 i) {
		this.i = i;
	}

	public T2 getJ() {
		return j;
	}

	public void setJ(T2 j) {
		this.j = j;
	}
	
	
	
	

}
