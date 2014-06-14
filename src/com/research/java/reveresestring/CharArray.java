package com.research.java.reveresestring;

public class CharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] ch = {'a','b','c','d'};
		char[] ch1 = new char[ch.length];
		int j = 0;
		
		
		for(int i = ch.length-1; i >=0; i--){
			//System.out.println(ch[i]);
			
			ch1[j] = ch[i];
			System.out.println(ch1[j] + " " + j);
			j++;
			
		}
		System.out.println("CH1 length: " + ch1[0]);
		System.out.println("CH1 length: " + ch1.length);
		System.out.println("----------");
		for(int i = 0; i <= ch1.length-1; i++){
			//System.out.println(ch[i]);
			//ch1[i] = ch[i];
			System.out.println(ch1[i] + " " + i);
			
		}
		

	}

}
