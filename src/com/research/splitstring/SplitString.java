package com.research.splitstring;

import java.util.ArrayList;
import java.util.Iterator;


public class SplitString {
    public static void main(String[] args) {
    	String word = "ABCDEFGHIJ";
    	int splitLen = 3;
    	ArrayList wordList = getList(word, splitLen);
    	Iterator wordItr = wordList.iterator();
        while(wordItr.hasNext()){
            System.out.println(wordItr.next());
        }
    }
    
    public static ArrayList getList(String word, int splitLen) {
        ArrayList wordList = new ArrayList();
        int size = word.length();
        String str;
        for( int i = 0; i < size; i++ )
        {
        	/* This take cares of the left over characters, if characters are
        	 * less then split length
        	 */
        	str = word.substring(i, Math.min(size, i + splitLen));
        	
        	wordList.add(str);//Adding wordList to ArrayList
        	i = (i + splitLen)  - 1; //Because ArrayList index is Length -1 ;
        }
        return wordList;
    }
}
