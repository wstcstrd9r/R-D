package com.research.java.constructor;

public class ClassX {

	protected int xMask = 15;
	protected int fullMask = 14;
	
	public ClassX(){
		System.out.println("calling from ClassX const " );
		this.mask();
		System.out.println("calling from ClassX const after X mask " + fullMask);
	}
	
	public void mask(){
		System.out.println("mask in class X " + fullMask );
	}
	
}
