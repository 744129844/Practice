package com.ren.collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", 0301);
		map.put("name", "gaoqi");
		map.put("department", "xaingmu");
		map.put("salary", 3050);
		
		Map map2 = new HashMap();
		map2.put("id", 0301);
		map2.put("name", "mashib");
		map2.put("department", "jiaoxue");
		map2.put("salary", 3050);
		
		List<Map> list = new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Map> list) {
		for (int i = 0; i < list.size(); i++) {
			Map temp = list.get(i);
			System.out.println(temp.get("name"));
		}
	}

}
