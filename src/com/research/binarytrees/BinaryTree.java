package com.research.binarytrees;

public class BinaryTree {

	public static void main(String[] args) {
		//In order:aim for the smalled values first. start with the left child
		Node node = new Node();

		
		node.add(7);
		node.add(1);
		node.add(0);
		node.add(3);
		node.add(2);
		node.add(5);
		node.add(4);
		node.add(6);
		node.add(9);
		node.add(8);
		node.add(10);
		System.out.println("Preorder Traversal");
		node.preOrderTraversal(node.root);
		System.out.println();
		System.out.println("Inorder Traversal");
		node.inOrderTraversal(node.root);
		System.out.println();
		System.out.println("Postorder Traversal");
		node.postOrderTraversal(node.root);
		System.out.println("");
		System.out.println("Search for 8");
		System.out.println(node.findNode(8).getValue());
		System.out.println("Size: " + node.size(node.root)); 
	}
	
	
	

}
