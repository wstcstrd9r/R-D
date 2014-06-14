package com.research.list;

public class ListDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListImpl listImpl = new ListImpl();
		
		listImpl.add("Kirandeep");
		//System.out.println("Was it added " + obj.toString());
		listImpl.add("kirandeep1");
		
		//Object obj1 = (String) listImpl.get(1);
		//System.out.println("what is the first object " + obj1);
		Object[] allObject = listImpl.getAll();
		for(int i = 0; i < allObject.length; i++){
			if(!allObject[i].equals(null)){
				System.out.println(allObject[i]);
			}
		}
		
		

	}

}
