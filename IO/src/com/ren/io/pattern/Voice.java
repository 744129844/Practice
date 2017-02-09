package com.ren.io.pattern;

public class Voice {
	
	private int voice = 100;
	
	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	public void say(){
		System.out.println(voice);
	}

}
