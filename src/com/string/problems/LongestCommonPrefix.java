package com.string.problems;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * @author knguyen
 *
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = {"flower","flow","flight"};
		System.out.println(prefix(strs));
		

	}

	public static String prefix(String[] strs) {
		
		if (strs.length == 0) {
			return "";
		}
		
		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			
			// Decrement prefix until a match is found or until prefix is empty
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
			System.out.println("PREFIX: " + prefix);
			
		}
		
		return prefix;
		
	}
	
}
