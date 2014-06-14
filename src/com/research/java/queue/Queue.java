package com.research.java.queue;

public class Queue {

	QueueNode head;
	QueueNode tail;

	public Queue(QueueNode head){
		this.head = head;
	}
	
	public Queue(){
		new QueueNode();
	}
	public void display(){

		QueueNode current = head;

		while (current.getNext() != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println(current.getValue());
	}
	public void deQueue(){
		QueueNode current = head;
		int size = 0;
		if(current.getNext() != null){
			while(current.getNext() != null){
				
				//remove first node
				if(current.getNext() != null){
					if(size == 0){
						head = head.getNext();
					}
				}
				current = current.getNext();
			}
		}else{
			System.out.println("There's only single node and you can't remove it");
		}
	}
	
	public void enQueue(QueueNode node){

		QueueNode current = head;
		while(current.getNext() != null) {
			current = current.getNext();

		}
		current.setNext(node);


	}

	public QueueNode search(QueueNode node){
		QueueNode curr = head;
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
		QueueNode curr = head;
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
