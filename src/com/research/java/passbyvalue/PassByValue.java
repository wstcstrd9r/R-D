package com.research.java.passbyvalue;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

public class PassByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 7;
		System.out.println("Number b4 prim " + number);
		passByValueprim(number);
		System.out.println("Number after prim " + number);
		
		String string = "abc";
		System.out.println("string b4 Ref " + string);
		passByValueRef(string);
		System.out.println("String after Ref " + string);
		
		String string1 = "DEF";
		System.out.println("string b4 RefObject " + string1);
		passByValueRefObject(string1);
		System.out.println("String after RefObject " + string1);
		ArrayList arrayList = new ArrayList();
		arrayList.add("test-1");
		arrayList.add("test0");
		Iterator itr = arrayList.iterator();
		while(itr.hasNext()){
			System.out.println("outside B4 " + itr.next());
		}
		arralyList(arrayList);
		Iterator itr1 = arrayList.iterator();
		while(itr1.hasNext()){
			System.out.println("outside after " + itr1.next());
		}
		Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		  System.out.println(" ");
		  tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y); 
		
		
	}
	public static void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  System.out.println("temp x: " + temp.x + " temp y: "  + temp.y);
	  System.out.println("arg2 x: " + arg2.x + " arg2 y: "  + arg2.y);
	  arg1 = arg2;
	  arg2 = temp;
	}
	
	public static int passByValueprim( int number){
		
		number = number + number;
		return number;
		
	}
	
	public static void passByValueRef( String string){
		
		string = new String("def");
		
	}
	
public static void passByValueRefObject( String string){
		
		string.toLowerCase();
		
	}
public static void arralyList(ArrayList arraylist){
	arraylist.add("TEST1");
	arraylist.add("Test2");
	
	Iterator itr = arraylist.iterator();
	while(itr.hasNext()){
		System.out.println("inSide " + itr.next());
	}
		
}

}