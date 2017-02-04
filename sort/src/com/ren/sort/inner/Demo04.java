package com.ren.sort.inner;

import java.util.Arrays;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
		Utils.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = {"asdf","ds","fasad","werqqwer","xcvzxcg"};
		StringComp com = new StringComp();
		//Utils.sort(arr2, com);
		System.out.println(Arrays.toString(arr2));
	}

}
