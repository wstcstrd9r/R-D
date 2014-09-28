package com.research.java.stack;

public class StackArray1 {
	private int[] array;
	private int top;
	private int currCapaity;
	private int totalCapaity;

	
	public StackArray1(int capacity){
		this.top = 0;
		this.totalCapaity = capacity;
		this.currCapaity = capacity;
		this.array = new int[capacity];
	}
	
	public void push( int value){
		if(!isFull()){
			this.array[top] = value; 
			this.top++;
			this.currCapaity--;
			System.out.println("Totalcapacity  CurrCacacity top ");
			System.out.println(totalCapaity + "   " + currCapaity + "   " + top);

		}
		
	}
	public void pop(){
		
		if(!isEmpty()){
			this.top--;
			this.currCapaity++;
			this.array[top]=0;

			System.out.println("Totalcapacity  CurrCacacity top ");
			System.out.println(totalCapaity + "   " + currCapaity + "   " + top);
		}
	}
	public boolean isFull(){
		
		if(this.top == this.totalCapaity){
			System.out.println("Array is full");
			return true;
		}else{
			return false;
		}
	}
	public boolean isEmpty(){
		if(top < 1){
			System.out.println("Array is Empty");
			return true;
			
		}else{
			return false;
		}
	}
	public void display(){
		for(int i=0; i < array.length; i++){
			System.out.println("List " + array[i]);
		}
	}
	
	

}
