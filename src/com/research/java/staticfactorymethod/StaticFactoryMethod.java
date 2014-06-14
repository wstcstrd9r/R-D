package com.research.java.staticfactorymethod;

public class StaticFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number = StaticFactoryMethod.intToInteger(5);
		System.out.println("Integer is " +   number );

	}
	
	public static Integer intToInteger(int number){
		return Integer.valueOf(number);
	}

}
