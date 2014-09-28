package com.research.swapping.without.temp;

public class Swapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int num1 = -20;

         int num2 = 10;
         num1 = num1 + num2;
         num2 = num1 - num2;
         num1 = num1 - num2;
         
         System.out.println("After swapping, num1= " + num1 + " and num2= "
                         + num2);
    }
}
