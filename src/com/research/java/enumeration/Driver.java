package com.research.java.enumeration;

import java.util.Iterator;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DayOftheWeek[] enumItter = DayOftheWeek.values();
		
		for(int i=0; i < enumItter.length; i++){
			System.out.println(enumItter[i]);
		}

	}

}
