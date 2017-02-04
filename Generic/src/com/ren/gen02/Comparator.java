package com.ren.gen02;

public interface Comparator<T> {
	
	public static final int Value = 100;
	
	public abstract void test(T t);

}

class interc1<A> implements Comparator{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

class interc2<A> implements Comparator<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}

class interc3<T,A> implements Comparator<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
	
}
