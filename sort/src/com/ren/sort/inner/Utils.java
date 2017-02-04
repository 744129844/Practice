package com.ren.sort.inner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Utils {
	
	public static<T extends Comparable<T>> void sort(List<T> list){
		Object[] arr = list.toArray();
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
	
	public static<T extends Comparable<T>> void sort(List<T> list,Comparator<T> com){
		Object[] arr = list.toArray();
		sort(arr,com);
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
	
	public static<T extends Comparable<T>> void sort(T[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0){
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			}
			if(t){
				return;
			}
		}
	}
	
	public static void sort(Object[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0){
					Object temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			}
			if(t){
				return;
			}
		}
	}
	
	public static void sort(String[] arr,Comparator com){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(com.compare(arr[j], arr[j+1])>0){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			}
			if(t){
				return;
			}
		}
	}
	
	public static<T> void sort(Object[] arr,Comparator<T> com){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(com.compare((T)arr[j], (T)arr[j+1])>0){
					Object temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			}
			if(t){
				return;
			}
		}
	}

}
