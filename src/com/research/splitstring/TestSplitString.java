package com.research.splitstring;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestSplitString {

	@Test
	public void test3char() {
		final String word = "ABC";
		final int splitLen = 3;
		ArrayList arrayListToTest = new ArrayList();
		arrayListToTest.add(word);
		ArrayList arrayList = SplitString.getList(word, splitLen);
		assertSame(arrayListToTest, arrayList);
		assertEquals(arrayListToTest.indexOf(0), arrayList.indexOf(0));
		
	}

}
