package com.ren.thread.syn;

public class MyJvm {
	
	private static MyJvm instance = new MyJvm();
	
	private MyJvm(){
		
	}

	public static MyJvm getInstance() {
		return instance;
	}

}

class MyJvm2 {
	
	private static MyJvm2 instance;
	
	private MyJvm2(){
		
	}

	public static MyJvm2 getInstance() {
		if(null==instance){
			synchronized (MyJvm2.class) {
				if(null==instance){
					instance = new MyJvm2();
				}
			}
		}
		return instance;
	}

}

class MyJvm3 {
	
	private static class JvmHolder{
		private static MyJvm3 instance = new MyJvm3();
	}
	
	private MyJvm3(){
		
	}

	public static MyJvm3 getInstance() {
		return JvmHolder.instance;
	}

}
