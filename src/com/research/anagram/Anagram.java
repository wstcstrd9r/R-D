package com.research.anagram;

public class Anagram {

	public static void main(String[] args) {

		String one = "the";

		String two = "ith";

		//System.out.println(new Anagram().test(one, two));
		isTrue(one, two);

	}

	public boolean test(String a, String b) {

		boolean result = true;

		StringBuilder one = new StringBuilder(a.replaceAll("[\\s+\\W+]", "").toLowerCase());

		StringBuilder two = new StringBuilder(b.replaceAll("[\\s+\\W+]", "").toLowerCase());

		if (one.length() == two.length()) {

			int index = -1;

			for (char c : one.toString().toCharArray()) {
				System.out.println(c);
				index = two.indexOf(String.valueOf(c));

				if (index == -1) {

					result = false;

					break;

				}

				two.deleteCharAt(index);

			}

		} else {

			result = false;

		}

		return result;

	}
	public static void isTrue(String one, String two){
		boolean isPresent = true;
		
		
		for(int i= 0; i < one.length(); i++ ){
			int index = -1;
			index = one.indexOf(two.charAt(i));
			
			if(index==-1){
				isPresent = false;
				break;
			}
			
		}
		System.out.println("result " + isPresent);
		//return isPresent;
		
	}

}
