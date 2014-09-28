package com.research.list;

public class ListImpl1 implements ListInt {
	Object obj[] = new Object[10]; 
	private int index=0;
	

	@Override
	public Object get(int i) {
		Object obj1 = new Object();
		obj1 = obj[i];
		return obj1;
	}

	@Override
	public boolean add(Object obj1) {
		if(index == obj.length-1){
			System.out.println("IS full");
				return false;
		}else{
			obj[index] = obj1;
			index++;
			return true;
		}
	}

	@Override
	public Object[] getAll() {
		return obj;
	}

}
