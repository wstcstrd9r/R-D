package com.research.java.enforenoninstantiablility;

public class EnforeNonInstantiablility {
	
	private EnforeNonInstantiablility(){
		throw new AssertionError();
	}
	
	public static void Test1(){
		System.out.println("IN EnforeNonInstantiablility class");
	}

}
