package com.research.java.eliminateobsoleteobjectreferences;

import java.util.EmptyStackException;

public class EliminateObsoleteObjectReferences {
	private Object[] elements;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Object pop( int size){
		if(size == 0){
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

}
