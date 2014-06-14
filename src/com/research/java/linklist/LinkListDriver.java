package com.research.java.linklist;

public class LinkListDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList linkList2 = new LinkList();
		LinkNode headNode = new LinkNode(1);
		LinkList linkedList= new LinkList(headNode ); 
		System.out.println("After Head");
		linkedList.display();
		LinkNode node2 = new LinkNode(2);
		linkedList.add(node2);
		System.out.println("After adding node");

		linkedList.display();
		LinkNode node3 = new LinkNode(3);
		linkedList.add(node3);
		System.out.println("After adding another");
		linkedList.display();

		LinkNode node4 = new LinkNode(4);
		linkedList.add(node4);
		System.out.println("After adding another");
		linkedList.display();
		/*LinkNode addHead = new LinkNode(6);
		linkedList.addToHead(addHead); */ 
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
		} */
		System.out.println("Size " + linkedList.size());
		linkedList.getTail();
		
		
		
		//linkedList.display();
	}
}