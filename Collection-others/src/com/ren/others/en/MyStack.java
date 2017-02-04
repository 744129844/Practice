package com.ren.others.en;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<E> {
	
	private Deque<E> container = new ArrayDeque<E>();
	private int cap;
	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	public boolean push(E e){
		if (container.size()+1>cap) {
			return false;
		}
		return container.offerLast(e);
	}
	public E pop(){
		return container.pollLast();
	}
	public E peek(){
		return container.peekLast();
	}
	public int size(){
		return container.size();
	}

}
