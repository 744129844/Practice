package com.ren.gen03;

import java.util.ArrayList;
import java.util.List;

public class ExtendsTest {
	
	public static void main(String[] args) {
		
		Test<Fruit> t1 = new Test<Fruit>();
		Test<Apple> t2 = new Test<Apple>();
		Test<Pear> t3 = new Test<Pear>();
		List<? extends Fruit> l1 = new ArrayList<Apple>();
		test(l1);
		List<Fruit> l2 = new ArrayList<Fruit>();
		test(l2);
		l2.add(new Fruit());
		List<Apple> l3 = new ArrayList<Apple>();
		test(l3);
	}
	
	public static void test(List<? extends Fruit> list){
	}
	
	static class Test<T extends Fruit>{
		
	}

}
