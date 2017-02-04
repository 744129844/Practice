package com.ren.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("gaoqi", new Wife("haha"));
		map.put("zhangsan", new Wife("xixi"));
		map.remove("gaoqi");
		Wife w = (Wife)map.get("zhangsan");
		System.out.println(w.name);
	}

}

class Wife {
	String name;

	public Wife(String name) {
		super();
		this.name = name;
	}
	
}
