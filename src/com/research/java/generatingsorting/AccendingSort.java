package com.research.java.generatingsorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class AccendingSort {

	/**
	 * @param args
	 * 
	 */
	public static int[] accendingSort(int[] nums) {
		int smallestInt = 0;
		int smallestLocation = 0;
		int firstElementValue = 0;
		for (int i = 0; i < nums.length; i++) {
			firstElementValue = (Integer) nums[i];
			smallestInt = (Integer) nums[i];
			for (int j = i; j < nums.length; j++) {
				if (smallestInt >= (Integer)nums[j]) {
					smallestInt = (Integer)nums[j];
					smallestLocation = j;
				}
			}
			nums[i] = smallestInt;
			nums[smallestLocation] = firstElementValue;
		}
		return nums;

	}

}
