package com.research.java.array;

public class FindNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int num[] = {2,3,4,2,3};
		
		int test = maxRS(num);
		System.out.println(test);
		

	}
	
	// you can also use imports, for example:
	// import java.math.*;
	public static int maxRS( int[] a) {
	    // write your code here
		
		int start = a[0];
		for(int i=0; i < a.length; i++){
			if(start < a[i]){
				return start;
			}
				

		}
		
		return -1;
	}

}
