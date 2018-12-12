package com.string.problems;

/**
 * Problem
 * - Find the number of the letter 'a' in the string repeated up to the length n
 *
 */

public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "aba";
		long n = 10;
		
		System.out.println(repeatedString(s, n));
		
	}
	
	/**
	 * Time complexity O(n)
	 * Space complexity O(1)
	 * 
	 * @param s input string
	 * @param n length of final string
	 * @return count of the letter 'a'
	 */
	
    static long repeatedString(String s, long n) {

    	long count = 0;
    	
    	for (int i = 0; i < s.length(); i ++) {
    		if (s.charAt(i) == 'a') {
    			count++;
    		}
    	}
    	
    	long factor = n / s.length();
    	long remainder = n % s.length();
    	
    	count = count * factor;
    	
    	for (int i = 0; i < remainder; i++) {
    		if (s.charAt(i) == 'a') {
    			count++;
    		}
    	}
    	
    	return count;

    }
	
}
