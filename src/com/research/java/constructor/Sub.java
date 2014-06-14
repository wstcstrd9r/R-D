package com.research.java.constructor;

import java.util.Date;

public final class Sub extends Super {
	
	private final Date date;
	
	Sub(){
		System.out.println("in Sub Sub() Constructor");
		date = new Date();
	}
	
	@Override 
	public void overrideMe(){
		System.out.println(date + " jijf");
	}
	
	public static void main( String[] args){
		Sub sub = new Sub();
		sub.overrideMe();
	}

}
