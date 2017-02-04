package com.ren.gen02;

public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}

class c1<T1,T2,A,B> extends Father<T1,T2>{
	
	A Sex;

	@Override
	public void test(T2 name) {
		
	}

}

class c2<T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		
	}
	
}

class c3 extends Father<Integer,String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}
	
}

class c4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}
	
}