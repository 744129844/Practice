package com.ren.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		Employee e = new Employee(0301, "gaoqi", 3000, "xiangmu", "2007-10");
		Employee e2 = new Employee(0302, "mashibing", 3500, "xiangmu", "2006-10");
		Employee e3 = new Employee(0303, "peixin", 3500, "xiangmu", "2007-10");
		
		List<Employee> list = new ArrayList();
		
		list.add(e);
		list.add(e2);
		list.add(e3);
		
		
	printEmployee(list);
	}
	
	public static void printEmployee(List<Employee> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
	}

}
