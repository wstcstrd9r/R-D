package com.research.java.array;

import java.util.*;


public class FindSmallestInt{

	public static void main(String[] str){


		int num[] = {10,7,11,5,4,2,1};
		int l = num.length;
		int smallestInt;
		int location = 0;
		int i = 0;
		System.out.println("Length " + l);
		smallestInt=num[0];
		for(i=0; i < num.length; i++){
			if(smallestInt > num[i]){
				smallestInt = num[i];
				location = i;
			}
				

		}
		System.out.println("sma " + smallestInt + " location " + location);
	}

}