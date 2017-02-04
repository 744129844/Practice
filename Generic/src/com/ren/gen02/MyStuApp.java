package com.ren.gen02;

public class MyStuApp {
	
	public static void main(String[] args) {
		MyStudent stu = new MyStudent<Double,String>(10.55,"haha");
		test(stu);
	}
	
	public static void test(MyStudent<Integer,String> stu){
		System.out.println(stu.getI());
	}

}
