package com.research.java.overridingtostring;

public class OverRidingToString {
	int areaCode = 510;
	int prefix = 750;
	int lineNumber = 5405;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRidingToString ove = new OverRidingToString();
		System.out.println("Format " + ove.toString() );
	}
	
	@Override public String toString(){
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
		
	}

}
