package com.research.ampi;

public class Solution1 {
	public static void main(String[] args) {

		int[] array = {1,5,17,18,20,50};
		int result;
		result = amplitude(array);
		System.out.println("amplitude = " + result);

	}
	public static int amplitude( int[] A ) {
		int l = A.length;
		int largestInt = 0;
		int value = 0;
		
		largestInt=A[0];
		for(int i=0; i <= l; i++){
			for(int j = i+1; j < l; j++){
			    value = A[j] - A[i];
			if(largestInt < value){
				largestInt = value;
			}
			break;
			}
		}			
	  return largestInt;
	}
}
