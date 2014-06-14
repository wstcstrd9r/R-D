package test;

import java.math.BigInteger;
import java.security.SecureRandom;

public class TestRandonString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STRING_LENGTH = 3;  
	    StringBuffer sb = new StringBuffer();  
	    for (int x = 0; x < STRING_LENGTH; x++)  
	    {  
	      sb.append((char)((int)(Math.random()*26)+97));  
	    }  
	    System.out.println(sb.toString());  
	  }
	}


