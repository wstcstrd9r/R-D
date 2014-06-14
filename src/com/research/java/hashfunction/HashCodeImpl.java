package com.research.java.hashfunction;

import java.util.ArrayList;
import java.util.Random;

public class HashCodeImpl /*implements HashCodeInterface */  {
	
	Object[] objectArray;
	ArrayList<Integer> arrayList;
	int mod=0;
	int i = 0;
	
	public HashCodeImpl(int size, int mod){
		objectArray = new Object[size];
		arrayList = new ArrayList<Integer>();
		this.mod = mod;

	}
	
	/*public int generateHashCode(Object obj){
		
		//Random ran = new Random();
		String objToString = obj.toString();
		int generatedValue = 0;
		generatedValue = Math.abs(objToString.hashCode()) % 10;
		System.out.println("generatedValue: " + generatedValue);
		if(arrayList.contains(generatedValue)  ){
			i++;
			generatedValue = generateHashCode(obj);
			
		}else{
			if(!arrayList.contains(generatedValue)){
			arrayList.add(generatedValue);
			return generatedValue;
			}
		} 
		return generatedValue;
	
	} */
	
	public int generateHashCode(Object obj){
		
		//Random ran = new Random();
		String objToString = obj.toString();
		int generatedValue = 0;
		generatedValue = Math.abs(objToString.hashCode()) % 10;
		System.out.println("generatedValue: " + generatedValue);
		 
		return generatedValue;
	
	}
	
	public void put(Object key, Object obj){
		int hashCode = generateHashCode(key.toString());
		System.out.println("hashcode going in: " + hashCode);
		objectArray[hashCode] = obj;
	}

	public Object get(Object obj){
		int value = generateHashCode(obj);
			Object retObj = objectArray[value];
		
		
		return retObj;
	}
	
	public void test( Object obj){
		System.out.println("what's an object " + obj.toString());
	}
	
}
