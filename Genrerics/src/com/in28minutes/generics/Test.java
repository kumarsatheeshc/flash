package com.in28minutes.generics;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BiConsumer<Integer, Integer> bi = (a,b) -> System.out.println(a+b);
		
		bi.accept(5, 10);
		
	}

}


 class Test1 {}

