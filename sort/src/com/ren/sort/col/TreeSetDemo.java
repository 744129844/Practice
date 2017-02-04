package com.ren.sort.col;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person("1",1000);
		Person p2 = new Person("2",500);
		Person p3 = new Person("3",100);
		Person p4 = new Person("4",1500);
		
		TreeSet<Person> person = new TreeSet<Person>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						return o1.getHandsome()-o2.getHandsome();
					}
					
				}
				);
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		//添加数据时排序
		System.out.println(person);
	}

}
