package com.research.java.recursion;

public class StringRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Test";
		System.out.println("what is test " + name.charAt(0));
		int length = (name.length()-1);
		
		String reverseName = factorialCall(name, length);
		System.out.println("Number " + reverseName);
		//String reverseName = StringRecursion.rec1(name, length);
		//System.out.println("Number " + reverseName);

	}

	public static String factorialCall(String name, int length){
		//System.out.println("length at function start " + length);
		String stringRe = "";
		if(length<0){
			System.out.println("is 1");
			//System.exit(0);
			return stringRe;
		}else{
			stringRe += name.charAt(length);
			System.out.println("Length " + length);
			return  stringRe + factorialCall(name, length-1);
		}
		
		//System.out.println("After the call" + n);
	}
	public static String rec1(String str, int len){
		String strRe = new String();
		System.out.println( "what is len " + len);
		for( int i = len; i > -1; i--){
			strRe += str.charAt(i); 
			System.out.println( "what is value " + str.charAt(i));
			System.out.println( "what is i " + i);
		}
		System.out.println("in Func " + strRe );
		return strRe;
		
	}

}
