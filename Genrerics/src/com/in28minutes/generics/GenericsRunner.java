package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	
	static void addAFewNumbers(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1l);
		numbers.add(1.0);
		numbers.add(1.0);
		}
	
	//You can use wild card with generics too - ? extends Number
	
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		//numbers.add(1);
		for(Number number:numbers) {
			//double num = number;
		sum = sum + (double) number;
		}
		return sum;
		}

	
	
	//We can create generic methods as well
	static <X> X doSomething(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Number> numberList = new ArrayList<>();
		addAFewNumbers(numberList);
		System.out.println(numberList);
		
		//System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1, 2.1, 3.1, 4.1, 5.1)));
		//System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));
		
		
		
		String text = doSomething("Hello");
		Integer value1 = doSomething(Integer.valueOf(7));
		ArrayList<String> list3 = doSomething(new ArrayList<String>(List.of("A", "B", "C")));
		duplicate(list3);
		System.out.println(list3);
		LinkedList<Integer> list4 = doSomething(new LinkedList<Integer>(List.of(1, 2, 3)));
		duplicate(list4);
		System.out.println(list4);
		
		MyCustomlist<Long> list = new MyCustomlist<>();
		
		
//		list.addElement("Element 1");
//		list.addElement("Element 2");
		
		list.addElement(5l);
		list.addElement(6l);
		
	//	String value =  list.get(0);
		
		Long value =  list.get(0);
		
		System.out.println(value);
		
		MyCustomlist<Integer> list2 = new MyCustomlist<>();
		
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		Integer number = list2.get(0);
		
		System.out.println(number);
		
	}

}
