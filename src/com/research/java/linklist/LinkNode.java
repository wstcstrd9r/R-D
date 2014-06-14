package com.research.java.linklist;

public class LinkNode {
	// Constructors
	private int   value;
	private LinkNode next;

	public LinkNode( int value) {
		this.value = value;
	}
	public LinkNode() {
		// TODO Auto-generated constructor stub
	}
	public LinkNode(LinkNode next2) {
		// TODO Auto-generated constructor stub
	}
	public LinkNode getNext() {
		return next;
	}
	public void setNext(LinkNode node) {
		this.next = node;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}		   
}
