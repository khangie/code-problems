package com.string.problems;

/*
 * 1) Only one odd count is available.
 * 2) The rest of the counts are even
 */

public class PermutationOfPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPermutationOfPalindrome("tact coa"));
		
	}
	
	public static boolean isPermutationOfPalindrome(String input) {
		
		int[] table = new int[128];
		
		for (int i = 0; i < input.length(); i++) {
			int val = input.charAt(i);
			if (val != ' ') {
				table[val]++;
			}
		}
		
		int numOdds = 0;
		
		for (int i = 0; i < table.length; i++) {
			if (table[i] % 2 != 0) {
				numOdds++;
			}
		}
		
		if (numOdds <= 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
