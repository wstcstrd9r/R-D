package com.research.java.constructor;

public class Super {
	
	public Super(){
		overrideMe();
		System.out.println("in Super's Const");
	}
	
	public void overrideMe(){
		System.out.println(" Super class's overrideMe");
	}

}
