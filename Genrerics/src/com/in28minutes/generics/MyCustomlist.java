package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomlist<T extends Number> {
	
	
	ArrayList<T> list = new ArrayList<>();
	
	
	public void addElement(T s) {
		list.add(s);
		
	}
	
	public void removeElement(T s) {
		list.remove(s);
		
	}

	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

}
