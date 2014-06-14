package com.research.java.binarysearch;

import com.research.java.generatingsorting.AccendingSort;
import com.research.java.generatingsorting.GenerateArray;

public class BinarySearchDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GenerateArray generateArray = new GenerateArray(20);
		//int[] array = generateArray.generateArray();
		//int[] sortedArray = AccendingSort.accendingSort(array);
		//int end = 16;
		//int start = 1;
		//for(int i = 0; i < sortedArray.length; i++){
			//System.out.println("numbers " + sortedArray[i]);
		//}
		//System.out.println("Size of Array " + array.length );
		int[] sortedArray = {2,4, 6, 8, 10, 12, 14, 16};
		search( 2, sortedArray);
		
		
		

	}
	
	public static Boolean search(int value, int[] array){
		int start = 0;
		int end = array.length-1;
		int mid = 0;
		int middleOfArray = 0;
		int i = 0;
		int j = 0;
		int stop = 0;
		

		while(mid != value){
			
			//middleOfArray = (end - start) / 2;
			middleOfArray = (int) Math.ceil((end - start) / 2);
			 mid = array[middleOfArray];
			 
			 if(middleOfArray == 0){
					stop++;
				}
			if(value < mid ){
				//middleOfArray = (end - start) / 2;
				middleOfArray = (int) Math.ceil((end - start) / 2);
				if(middleOfArray < 1){
					middleOfArray = (end - start) % 2;
				}
				System.out.println("middleOfArray " + middleOfArray);
				 mid = array[middleOfArray];
				end = middleOfArray;
				
				System.out.println("start " + start + " end " + end + " middleOfArray " + middleOfArray + " mid " + mid + " value " + value );
				System.out.println("Left " + i++);
			}
			if(value > mid ){
				
				middleOfArray = (int) Math.ceil((end - start) / 2);
				if(middleOfArray < 1){
					middleOfArray = (end - start) % 2;
				}
				 mid = array[start + middleOfArray];
				 start = start + (middleOfArray);
				System.out.println("start " + start + " end " + end + " middleOfArray " + middleOfArray + " mid " + mid + " value " + value );
				System.out.println("Right " + j++);
				
			}
			if((middleOfArray == 0 && stop > 2)){
				return null;
			}
			
		}
		if(mid == value){
			System.out.println("start " + start + " end " + end + " middleOfArray " + middleOfArray + " mid " + mid + " value " + value );
			System.out.println("found " + mid);
			return true;
		}

		return null;
	}

}
