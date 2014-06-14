package com.research.java.hashfunction;

public class HashCodeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mod = 10;
		int arrySize = 10;
		//HashCodeInterface hashFunction = new HashCodeImpl(10);
		HashCodeImpl hashFunction = new HashCodeImpl(mod, arrySize );
		
		/*hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");
		hashFunction.generateHashCode("");*/
		
		//hashFunction.generateHashCode("jasleen5");
		
		
		

		Person person1 = new Person("1", "jasleen");
		System.out.println("name " + person1.getName());
		hashFunction.put(person1.getName(), person1);
		
		Person person2 = new Person("2", "veeru");
		System.out.println("name " + person2.getName());
		hashFunction.put(person2.getName(), person2);
	
		Person person3 = new Person("3", "jasleen2");
		System.out.println("name " + person3.getName());
		hashFunction.put(person3.getName(), person3);
		
		Person person4 = new Person("4", "aman");
		System.out.println("name " + person4.getName());
		hashFunction.put(person4.getName(), person4); 
		
		Person person5 = new Person("5", "jasleen19");
		System.out.println("name " + person5.getName());
		hashFunction.put(person5.getName(), person5);

		Person person6 = new Person("6", "jasleen9");
		hashFunction.put(person6.getName(), person6);
	
		Person person7 = new Person("7", "jasleen8");
		hashFunction.put(person7.getName(), person7);
		
		Person person8 = new Person("8", "jasleen7");
		hashFunction.put(person8.getName(), person8);
		
		Person person9 = new Person("9", "babbu");
		hashFunction.put(person9.getName(), person9); 
		
		Person person10 = new Person("10", "jasleen5");
		hashFunction.put(person10.getName(), person10);
      
		
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		//System.out.println("value = " + hashFunction.generateHashCode(mod));
		
	
		
		Object jasleen = hashFunction.get("jasleen5");
		Person person = (Person) jasleen;
		System.out.println("jasleen = " + person.getName() + " id " + person.getId() );

		
		
		
		
		

	}

}
