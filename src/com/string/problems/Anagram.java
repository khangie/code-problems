package com.string.problems;

/**
 * Two strings are anagrams if they have the same set of characters in any order
 * 1) Ignore spaces
 * 2) Case insensitive
 * 
 * 
 * @author knguyen
 *
 */

public class Anagram {

	public static void main(String[] args) {
		
		String input1 = "Anagram x";
		String input2 = "xMargana";
		
		System.out.println(isAnagram(input1, input2));
		
	}
	
	public static boolean isAnagram(String input1, String input2) {
		
		input1 = clean(input1);
		input2 = clean(input2);
		
		System.out.println("INPUT1: " + input1 + " INPUT2: " + input2);
		
		return false;
		
	}
	
	public static String clean(String input) {
		return input.replace(" ", "").toLowerCase();
	}
	
}
