package com.research.ampi;


public class Solution /////
{
  
  public static void main(String a[])
  {
      int result = 0;
      result = hex_bitcount("2f");
      System.out.println("Result " + result );//ff...
 
  }
  public static int hex_bitcount ( String S )
  {
       int n=0;
       int count=0;
       if(S.length()<=100000)
       {
            n=Integer.parseInt(S,16);
            
            while (n != 0)
            {
                  n &= (n-1) ;
                  count++;
             }
                 return count;
       }
       return n;
  }
}

//Time Complexity O(logn)
//Space Complexity O(1)