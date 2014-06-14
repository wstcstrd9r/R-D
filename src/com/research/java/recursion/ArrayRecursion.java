package com.research.java.recursion;

import com.research.java.generatingsorting.AccendingSort;
import com.research.java.generatingsorting.GenerateArray;

public class ArrayRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenerateArray generateArray = new GenerateArray(20);
		int[] array = generateArray.generateArray();
		int[] sortedArray = AccendingSort.accendingSort(array);
		int end = sortedArray.length-1;
		int start = 0;
		int i = 0;
		int value = 6;
		for(int k = 0; k < sortedArray.length; k++){
			System.out.println("numbers " + sortedArray[k]);
		}
		int[] arrayTry = {2,4,6,8,10,12,14,16,18};
		int end1 = arrayTry.length-1;
		int number = search( arrayTry, start, end1, value,  0, 0);
		
		System.out.println("NUmber is = " + number);




	}

	public static int search(int[] array, int start, int end, int value, int mid, int middleOfArray) {
		
		if(value == mid){
			return mid;
		}
		if (value < mid) {
			middleOfArray = (end - start) / 2;
			mid = array[middleOfArray];
			end = middleOfArray;
			System.out.println("left--------" + "start = " + start + " End = " + end + " Value " +  value + " mid = " + mid + " middleOfArray = " + middleOfArray );
			if(middleOfArray==0){
				return -1000;
			}else{
				return search(array, start, end, value, mid, middleOfArray);
			}
		} else if (value > mid) {
			middleOfArray = (int) Math.ceil((end - start) / 2);
			if(middleOfArray < 1){
				middleOfArray = (end - start) % 2;
			}
			mid = array[start + middleOfArray];
			start = start + (middleOfArray);
			System.out.println("right--------" + "start = " + start + " End = " + end + " Value " +  value + " mid = " + mid + " middleOfArray = " + middleOfArray );
			if(middleOfArray==0){
				return -1000;
			}else{
				return search(array, start, end , value, mid, middleOfArray);
			}
			
			
			

		} else if(middleOfArray==0) {
			return -1000;   // Found it.
		}
		return middleOfArray;


		
	}
}


