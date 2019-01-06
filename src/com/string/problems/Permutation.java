package com.string.problems;

public class Permutation {

	/**
	 * If two strings are permutations, they have the same characters in a different order
	 * @param args
	 */
	
	public static void main(String args[]) {
		
		String input1 = "test";
		String input2 = "tste";
		
		System.out.println(isPermutation(input1, input2));
		
	}
	
	public static boolean isPermutation(String input1, String input2) {
		
		if (input1.length() != input2.length()) {
			return false;
		}

		return(sort(input1).equals(sort(input2)));
		
	}
	
	public static String sort(String input) {
		
		char[] charArray = input.toCharArray();
		java.util.Arrays.sort(charArray);
		return new String(charArray);
		
	}
	
}
