package com.research.list;

public class ListImpl implements ListInt {

	private Object[] obj = new Object[10];
	int index = 0;
	
	public Object get(int i){
		Object obj1 = new Object();
		obj1 = obj[i];
		
		
		return obj1;
	}
	
	public boolean add(Object obj1){
		
		if(index == obj.length-1 ){
			return false;
		}else{
			obj[index] = obj1;
			index++;
			return true;
		}
		
	}
	
	public Object[] getAll(){
		return obj;
	}

}
