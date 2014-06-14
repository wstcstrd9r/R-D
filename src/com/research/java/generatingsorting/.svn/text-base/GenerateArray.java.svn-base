package com.research.java.generatingsorting;

import java.util.ArrayList;
import java.util.Random;

public class GenerateArray {
	private int mod;

	public GenerateArray( int mod){
		this.mod = mod;
	}

	public int[] generateArray(){
		Random ran = new Random();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int generatedValue;
		int[] nums = new int[mod];
		int i = 0;
		while(arrayList.size() < mod){

			generatedValue = ran.nextInt(99)%mod;
			if(!(arrayList.contains(generatedValue))){			
				arrayList.add(generatedValue);
				nums[i] = generatedValue;
				i++;
			}
		}

		return nums;
	}

}
