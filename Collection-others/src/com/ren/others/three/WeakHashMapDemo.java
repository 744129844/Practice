package com.ren.others.three;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		WeakHashMap<String,String> map = new WeakHashMap<String,String>();
		map.put("a", "a");
		map.put("b", "b");
		map.put(new String("c"), "c");
		map.put(new String("d"), "d");
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}

}
