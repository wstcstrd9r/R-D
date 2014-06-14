package com.research.java.recursion;

public class FactorialRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = factorialCall(5);
		System.out.println("Number " + number);

	}
	
	public static int factorialCall(int n){
		System.out.println("before all the calls" + n );
		if(n==0){
			System.out.println("is 1");
			return 1;
		}else{
			return n * factorialCall(n-1);
		}
		//System.out.println("After the call" + n);
	}

}
