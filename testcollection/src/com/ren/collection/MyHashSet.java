package com.ren.collection;

import java.util.HashMap;

public class MyHashSet {
	
	HashMap map;
	private static final Object PRESENT = new Object();
	
	public MyHashSet (){
		map = new HashMap();
	}
	
	public void add(Object obj) {
		map.put(obj, PRESENT);
	}
	
	public int size() {
		return map.size();
	}
	
	public static void main(String[] args) {
		MyHashSet s = new MyHashSet();
		s.add("aaa");
		System.out.println(s.size());
	}

}
