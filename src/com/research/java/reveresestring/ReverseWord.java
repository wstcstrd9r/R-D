package com.research.java.reveresestring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class ReverseWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I Love my Iphone";
		System.out.println("at location 15 " + str.charAt(15));
		ArrayList<String> revList = revWord(str);
		System.out.println("revList size + " + revList.size());
		for(int i = revList.size()-1; i >= 0; i--){
			System.out.print(revList.get(i) + " ");
		}

	}
	
	public static ArrayList<String> revWord(String str){
		String token = "";
		ArrayList<String> revList = new ArrayList<String>(); 
		System.out.println("Length ");
		System.out.println(str.length()-1);
		for( int i = 0; i <= str.length()-1; i++){
			if( (str.charAt(i) == ' ')  ){
				revList.add(token);
				token = "";
			}else{

				token += str.charAt(i);
				//System.out.println("token is blank " + token);
				
				
			}
			

		}
		revList.add(token);
		
		return revList;
	}

}
