package com.research.triangle;

public class Triangle {
    public static void main(String[] args) {
        int size = 7;
        for(int i=0;i<size;i++) {
            int j;
            int spaceCounter = size-i-1;

            for(j=0;j<spaceCounter;j++) {
                System.out.print(" ");
            }

            for(j=0;j<=(i*2);j++) {
                if(j%2==1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
