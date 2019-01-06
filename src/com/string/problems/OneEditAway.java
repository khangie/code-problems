package com.string.problems;

public class OneEditAway {

	/**
	 * Check to see if two strings are one edit away
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		System.out.println(isOneEditAway("pale", "ple"));
		System.out.println(isOneEditAway("pales", "pale"));
		System.out.println(isOneEditAway("pale", "bale"));
		System.out.println(isOneEditAway("pale", "bake"));

	}

	/*
	 * Assumes that input1.length() >= input2.length()
	 */
	
	public static boolean isOneEditAway(String input1, String input2) {
		
		int i = 0;
		int j = 0;
		
		int lengthDiff = input1.length() - input2.length();
		int numDifferences = 0;
		
		while ((i < input1.length()) && (j < input2.length())) {
			if (input1.charAt(i) != input2.charAt(j)) {
				numDifferences++;
				if (lengthDiff == 0) {
					i++;
					j++;
				} else {
					i++;
				}
			} else {
				i++;
				j++;
			}
		}
		
		// Account for different characters at the end
		if (numDifferences == 0) {
			numDifferences += lengthDiff;
		}
		
		if (numDifferences == 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
