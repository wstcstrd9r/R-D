package com.research.java.stack;

public class StackArray {
	// Constructors
	private int[] intArray;
	private int top;
	private int totalcapacity;
	private int currCapacity;

	public StackArray( int capacity) {
		this.intArray = new int[capacity];
		this.totalcapacity = capacity;
		this.top = capacity ;
		this.currCapacity= capacity  ;
	}
	public StackArray() {
		// TODO Auto-generated constructor stub
	}
	public int[] getIntArray() {
		return intArray;
	}
	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	public void push(int value){
		if(!isFull()){
		System.out.println("in Push");
		top--;
		currCapacity--;
			intArray[top] = value;
			

			System.out.println("Totalcapacity  CurrCacacity top ");
			System.out.println(totalcapacity + "   " + currCapacity + "   " + top);
		}else{
			System.out.println(" Is Full " );
		}
	}
	public void pop(){
		if(!isEmpty()){
			intArray[top] = 0;
			top++;
			currCapacity++;
			System.out.println("Totalcapacity  CurrCacacity top ");
			System.out.println(totalcapacity + "   " + currCapacity + "   " + top);
		}else{
			System.out.println(" Is not empty!!!!!!!" );
		}
	}
	
	
	public void display(){
		for(int i=0; i < intArray.length; i++){
			System.out.println("List " + intArray[i]);
		}
	}
	
	public boolean isFull(){
		if(top==0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isEmpty(){
		if(top==totalcapacity){
			return true;
		}else{
			return false;
		}
	}
			   
}
