package com.research.binarytrees;

public class Node1 {
	private int value;
	private Node1 leftChild;
	private Node1 rightChild;
	public Node1 root;
	
	public Node1 getRoot() {
		return root;
	}
	public void setRoot(Node1 root) {
		this.root = root;
	}
	public Node1(){
		this.value = 0;
		this.leftChild = null;
		this.rightChild = null;
	}
	public Node1(int value){
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	public void add(int value){
		root = add(root, value);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node1 add(Node1 root, int value){
		if(root == null){
			root = new Node1(value);
		}else if(root.getValue() > value){
			root.leftChild = add(root.leftChild, value);
		}else if(root.getValue() < value){
			root.rightChild = add(root.rightChild, value);
		}
		return root;
	}
	public Node1 findNode(int value){
		if(root == null){
			System.out.println("value not found");
			return null;
		}
		while(root.getValue() != value){
			if(root.getValue() > value){
				root = root.leftChild;
			}else{
				root = root.rightChild;
			}
			
		}
		return root;
	}
	public int size(Node1 toot){
		if( root == null){
			return 0;
		}else{
			return 1 + size(root.leftChild) + size(root.rightChild);
		}
	}
	public void  preOrderTraversal(Node1 root){
		if(root == null){
			return;
		}
		System.out.println(root.getValue());
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	}
	public void  inOrderTraversal(Node1 root){
		if(root == null){
			return;
		}
		
		inOrderTraversal(root.leftChild);
		System.out.println(root.getValue());
		inOrderTraversal(root.rightChild);
	}
	public void  postOrderTraversal(Node1 root){
		if(root == null){
			return;
		}
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.println(root.getValue());
	}
}
