package com.research.java.reveresestring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class TestCharArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig = "abcde";
		List<String> alist = new ArrayList<String>();
		
		testCharArra();
		
		alist = revWord();
		Iterator<String> itr = alist.iterator();
		while(itr.hasNext()){
			revString(itr.next());
		}
		
		
	}
	public static void testCharArra(){
		
		char[] chArray = {'a','b','c','d'};
	
		for(int i = chArray.length-1; i >=0; i-- ){
			System.out.print(chArray[i]);
		}
	}
	public static void revString(String string){
		
		//String string = "Kiran";
	
		for(int i = string.length()-1; i >=0; i-- ){
			System.out.print(string.charAt(i));
		}
		System.out.println("");
	}
public static List<String> revWord(){
		List<String> aList = new ArrayList<String>();
		String string = "I love I Phone";
		String temp = "";
		for(int i = string.length()-1; i >=0; i-- ){
			temp += string.charAt(i);
			if( string.charAt(i) == ' '){
				aList.add(temp);
				temp = " ";			
			}			
			
		}
		aList.add(temp);
		System.out.println("Size " + aList.size());
		/*Iterator<String> aItr = aList.iterator();
		while(aItr.hasNext()){
			System.out.println(aItr.next());
		}*/
		
		return aList;
	}
}
