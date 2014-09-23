package com.research.binarytrees;

public class BinaryTreeOrg {  
    
    BinaryTreeOrg left;  
    BinaryTreeOrg right;  
    int value;  
     
    public BinaryTreeOrg(int v) {  
     value = v;  
    }  
    public BinaryTreeOrg() {  
       } 
     
    // Insert a value into the tree  
    public void insert(int v) {  
     if(v < value) {  
      if(left == null)  
       left = new BinaryTreeOrg(v);  
      else  
       left.insert(v);  
     }  
     
     else if(v > value) {  
      if(right == null)  
       right = new BinaryTreeOrg(v);  
      else  
       right.insert(v);  
     }  
    }  
     
     
     
    public void preorder() {  
     System.out.println(value);  
     if(left != null) left.preorder();  
     if(right != null) right.preorder();  
    }  
     
     
     
     
    public void inorder() {  
     if(left != null) left.inorder();  
     System.out.println(value);  
     if(right != null) right.inorder();  
    }  
     
     
    public void postorder() {  
     if(left != null) left.postorder();  
     if(right != null) right.postorder();  
     System.out.println(value);  
    }  
     
     
     
     
    public static void main(String args[])  
    {  
     
     
     BinaryTreeOrg b = new BinaryTreeOrg();  
     
     
     b.insert(7);  
     b.insert(1);  
     b.insert(0);  
     b.insert(3);  
     b.insert(2);  
     
     b.insert(5);  
     b.insert(4);  
     b.insert(6);  
     b.insert(9);  
     b.insert(8);  
     b.insert(10);

     
     b.preorder();  
     //b.inorder();
     //System.out.print("inorder traversal"  + b.inorder());  
     //System.out.print("postorder traversal"+ b.postorder());
     
     
     
    }  
     
   }  