package com.research.java.generatingsorting;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] str) {
		GenerateArray generateList = new GenerateArray(6);
		AccendingSort accendingSort = new AccendingSort();
		

		int[] nums = generateList.generateArray();
		accendingSort.accendingSort(nums);
		
		for(int i = 1; i < nums.length; i++)
			System.out.println("Values " + nums[i]);
	}

}
