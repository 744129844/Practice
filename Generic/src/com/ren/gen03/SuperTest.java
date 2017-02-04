package com.ren.gen03;

import java.util.ArrayList;
import java.util.List;

public class SuperTest {
	
	public static void main(String[] args) {
		
		List<Apple> l1 = new ArrayList<Apple>();
		test(l1);
		List<Fruit> l2 = new ArrayList<Fruit>();
		test(l2);
		List l3 = new ArrayList();
		test(l3);
	}
	
	public static void test(List<? super Apple> list){
		list.add(new Apple());
		list.add(new FujiApple());
	}

}
