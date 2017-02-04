package com.ren.gen04;

import java.util.Arrays;
import java.util.Iterator;

public class MyList<E> implements Iterable<E>{
	
	private int size;
	private Object[] ea = new Object[5];
	
	public int getSize(){
		return size;
	}
	
	public void add(E e){
		if (ea.length==size) {
			ea = Arrays.copyOf(ea, size*2);
		}
		ea[size] = e;
		size++;
	}
	
	public Iterator<E> iterator(){
		return new Iterator<E>(){
			private int coursor=-1;

			public boolean hasNext(){
				return coursor+1<size;
			}

			public E next(){
				coursor++;
				return (E)ea[coursor];
			}

			public void remove(){
				System.arraycopy(ea, coursor+1, ea, coursor,size-(coursor+1));
				size--;
				this.coursor--;
			}
			
		};	
	}
	

}
