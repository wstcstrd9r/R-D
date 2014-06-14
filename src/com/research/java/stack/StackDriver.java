package com.research.java.stack;

public class StackDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray stackArray = new StackArray(5);
		stackArray.push(0);
		System.out.println("After 1st push");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.push(1);
		System.out.println("After 2nd push");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.push(2);
		System.out.println("After 3nd push");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.push(3);
		System.out.println("After 4nd push");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.push(4);
		System.out.println("After 5nd push");
		stackArray.display();
		System.out.println("---------------------------------");
		////after being full
		stackArray.push(5);
		System.out.println("After 6nd push");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("After 5st pop");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("After 4nd pop");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("After 3rd pop");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("After 2nd pop");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("After 1nd pop");
		stackArray.display();
		System.out.println("---------------------------------");
		stackArray.pop();
		System.out.println("result" + 133 % 4);
		System.out.println("result" + 131 % 4);
		System.out.println("result" + 134 % 4);
		System.out.println("result" + 138 % 4);
		
		
		/*Node remove3 = new Node(2);
		linkedList.remove(remove3); 
		
		System.out.println("After removing 3");
		linkedList.display();
		System.out.println("search");
		/*Node find3 = new Node(1);
		Node found = linkedList.search(find3);
		if(found==null){
			System.out.println("not found ");
		}else{
			System.out.println("Found " + found.getValue());
		} 
		System.out.println("Size " + linkedList.size());
		linkedList.getTail(); */
		
		
		
		//linkedList.display();
	}
}