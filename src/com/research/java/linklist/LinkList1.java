package com.research.java.linklist;

public class LinkList{

	LinkNode head;
	LinkNode tail;

	public LinkList1(LinkNode head){
		this.head = head;
	}
	
	public LinkList1(){
		new LinkNode();
	}
	public void display(){

		LinkNode current = head;

		while (current.getNext() != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println(current.getValue());
	}
	public void remove(LinkNode node){
		LinkNode current = head;

		if(current.getNext() != null){
			while(current.getNext() != null){
				//remove first node
				if(current.getNext() != null){
					if(current.getValue() == node.getValue()){
						head = head.getNext();
					}
				}
				
				if(current.getNext().getValue() == node.getValue()){
					//deleting last node
					if(current.getNext().getNext()==null){					
						current.setNext(null);
						break;
					}else{
						//delete in the middle
						current.setNext(current.getNext().getNext());				
					}
				}
				current = current.getNext();
			}
		}else{
			System.out.println("There's only single node and you can't remove it");
		}
	}
	
public void removeWorkingVersion(LinkNode node){
		
		System.out.print("in remove  ");
		LinkNode current = head;
		LinkNode preNode = null;
		LinkNode nextNode = null;
		
		
		while(current.getNext() != null){
					
			if(current.getNext().getValue() == node.getValue()){
				System.out.println("nodes " + preNode + " " + nextNode);
				current.setNext(current.getNext().getNext());
				
			}
//throw exception
//last  delete node
		
			current = current.getNext();
			
			System.out.println("----------------");
		}
	}
	
	public void addToHead( LinkNode node){
		LinkNode current = head;
		head = node;
		head.setNext(current);
	}
	public void add(LinkNode node){

		LinkNode current = head;
		while(current.getNext() != null) {
			current = current.getNext();

		}
		current.setNext(node);


	}
	public void getTail(){
		LinkNode curr = head;
		
		while(curr.getNext() != null){
			
			
			curr = curr.getNext();
			if(curr.getNext() == null){
				tail =curr;
			}
		}
		System.out.println("Tail = " + tail.getValue());
		
		
	}

	public LinkNode search(LinkNode node){
		LinkNode curr = head;
		while(curr.getNext() != null){
			
			if(curr.getValue() == node.getValue()){
				System.out.println("in if");
				return curr;
			}
			curr = curr.getNext();
		}
		return null;
		
	}
	
	
	public int size(){
		LinkNode curr = head;
		int size = 0;
		if(curr!=null){
			size++;
		}else{
			return size;
		}
		while(curr.getNext() != null){		
			size++;
			curr = curr.getNext();
		}
		System.out.println("size in size() " + size);
		return size;
	}
}
