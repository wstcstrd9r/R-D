package com.research.list;

public class ListDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListImpl1 listImpl = new ListImpl1();
		
		listImpl.add("Kirandeep");
		//System.out.println("Was it added " + obj.toString());
		listImpl.add("kirandeep1");
		
		Object obj1 = (String) listImpl.get(0);
		System.out.println("what is the first object " + obj1);
		Object[] allObject = listImpl.getAll();
		System.out.println("Size of List " + allObject.length);
		for(int i = 0; i < allObject.length; i++){
			if(allObject[i].equals(null)){
				System.out.println("That's IT");
				return;
			}else{
				
				System.out.println(allObject[i]); 
			}
		}
		
		

	}

}
