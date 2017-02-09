package com.ren.thread.status;

public class Demo01 {
	
	public static void main(String[] args) {
		Study s = new Study();
		new Thread(s).start();
		int i = 0;
		while(true){
			i++;
			if(i>=50){
				s.stop();
				break;
			}
			System.out.println("main-->"+i);
		}
	}

}

class Study implements Runnable{
	
	private boolean flag = true;

	@Override
	public void run() {
		while(flag){
			System.out.println("study thread...");
		}
	}
	
	public void stop(){
		this.flag = false;
	}
	
}
