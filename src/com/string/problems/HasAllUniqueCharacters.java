package com.string.problems;

import java.util.HashSet;

public class HasAllUniqueCharacters {

	/**
	 * Problem
	 * - Implement an algorithm to determine whether a string has all unique characters
	 * 
	 * Considerations
	 * - ASCII has 128 characters
	 * - Extended ASCII has 256 characters
	 * - Unicode has 65536 characters
	 * 
	 * Tips
	 * - Ask whether character set is ASCII, extended ASCII, or unicode
	 * 
	 * Assumptions
	 * - String is in ASCII 
	 * - String is at least two characters in size
	 * - If length > 128, then it is impossible to have all unique characters
	 * 
	 * If no additional data structures are allowed
	 * - Use a runner but the time complexity will be O(n2)
	 * - Sort the string and linearly traverse it but sorting will take time and space
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String input = "Hello";
		boolean result = isUniqueCharacters(input);
		System.out.println(result);
		
	}
	
	/**
	 * Determines whether a string has all unique characters
	 * 
	 * Time complexity
	 * - O(n)
	 * 
	 * Space complexity
	 * - O(1)
	 * 
	 * @param input input string
	 * @return true or false
	 */
	
	public static boolean isUniqueCharacters(String input) {
		
		// If length is greater than 128, then it is impossible to have all unique characters
		if (input.length() > 128) {
			return false;
		}
		
		// Maps each numeric representation of an ASCII value that was found
		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < input.length(); i++) {
			int val = input.charAt(i);
			if (charSet[val] == true) {
				return false;
			} else {
				charSet[val] = true;
			}
		}
		
		return true;
		
	}
	
}
