package com.research.java.constructor;

public class Y extends ClassX {
	protected int yMask = 16;
	protected int fullMask;
	public Y(){
		System.out.println("yMask in y Constructor");
		mask();
	}
	public void mask(){
		System.out.println("fullMask in mask y " + fullMask);
	}
}
