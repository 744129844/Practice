package com.ren.others.three;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		IdentityHashMap<String,String> map = new IdentityHashMap<String,String>();
		map.put("a", "a");
		map.put("b", "b");
		map.put(new String("c"), "c");
		map.put(new String("d"), "d");
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}

}
