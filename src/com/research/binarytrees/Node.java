package com.research.binarytrees;

public class Node {
	private int value;
	private Node leftChild;
	private Node rightChild;
	public Node root;
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public Node(){
		leftChild = null;
		rightChild = null;
		value = 0;
	}
	public Node(int value){
		leftChild = null;
		rightChild = null;
		this.value = value;	
	}
	public int getValue(){
		return  value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void add(int value){
		root = add(root, value);
	}
	
	public Node add(Node root, int value){

		if(root == null){
			root = new Node(value); 
		}else if(root.getValue() > value){
			root.leftChild = add(root.leftChild, value); 
		}else if(root.getValue() < value){
			root.rightChild = add(root.rightChild, value);
		}
		return root;
	}
	public void preOrderTraversal(Node root){
		if(root == null){
			return;
		}
		System.out.println(root.getValue() + " ");
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	}
	public void inOrderTraversal(Node root){
		if(root == null){
			return;
		}
		
		inOrderTraversal(root.leftChild);
		System.out.println(root.getValue() + " ");
		inOrderTraversal(root.rightChild);
	}
	public void postOrderTraversal(Node root){
		if(root == null){
			return;
		}
		
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.println(root.getValue() + " ");
	}

}
