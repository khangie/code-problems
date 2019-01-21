package com.string.problems;

import java.util.Arrays;

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
		
		System.out.println(isAnagramSort(input1, input2));
		
	}
	
	public static boolean isAnagramSort(String input1, String input2) {
		
		input1 = clean(input1);
		input2 = clean(input2);		
		
		return sort(input1).equals(sort(input2));
		
	}
	
	public static String sort(String input) {
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	public static String clean(String input) {
		return input.replace(" ", "").toLowerCase();
	}
	
}
