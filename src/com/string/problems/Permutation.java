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
		System.out.println(isPermutation2(input1, input2));
		
	}
	
	/**
	 * Two strings are permutations if the sorted results are equal
	 * @param input1
	 * @param input2
	 * @return
	 */
	
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
	
	/**
	 * Two strings are permutations if they have equal character counts
	 * @param input1
	 * @param input2
	 * @return
	 */
	
	public static boolean isPermutation2(String input1, String input2) {
		
		if (input1.length() != input2.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		
		for (int i = 0; i < input1.length(); i++) {
			int charVal = input1.charAt(i);
			letters[charVal]++;
		}
		
		for (int i = 0; i < input2.length(); i++) {
			int charVal = input2.charAt(i);
			letters[charVal]--;
			if (letters[charVal] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
