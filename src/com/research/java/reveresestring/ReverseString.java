package com.research.java.reveresestring;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig = "abcde";
		
		reverseString(orig);

	}
	public static void reverseString(String orig){
		int origLen = orig.length();
		String newString = "";
		//System.out.println(origLen);
		for( int i = origLen - 1; i >=0; i--){
			newString += orig.charAt(i);
			//System.out.print(i);
			//System.out.print(orig.charAt(i));
		}
		System.out.println("reverseSting " + newString);
	}
	

}
