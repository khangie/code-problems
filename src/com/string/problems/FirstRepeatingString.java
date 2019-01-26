package com.string.problems;

/*
 * Find the index of the first repeating string of 3 characters
 * 
 * 
 */

public class FirstRepeatingString {

	public static void main(String[] args) {

		String input1 = "abcabc";  // 0
		String input2 = "aabcabc"; // 1
		String input3 = "aaaa";    // 1
		String input4 = "ab";      // -1
		
		System.out.println(input1);
		System.out.println(repeatingString(input1));
		
		System.out.println(input2);
		System.out.println(repeatingString(input2));
		
		System.out.println(input3);
		System.out.println(repeatingString(input3));
		
		System.out.println(input4);
		System.out.println(repeatingString(input4));
		
	}
	
	/*
	 * aabcabc
	 *     ^
	 * 
	 */
	
	public static int repeatingString(String input) {
		
		if (input.length() <= 3) {
			return - 1;
		}
		
		int i = 0;
		int j = 1;
	
		while (i < input.length() - 3) {
		
			j = i + 1;
			
			while (j < input.length() - 2) {
				
				if (input.charAt(i) == input.charAt(j) && input.charAt(i+1) == input.charAt(j+1) && input.charAt(i+2) == input.charAt(j+2)) {
					return i;
				} else {
					j++;
				}
				
			}
			
			i++;
			
		}

		return -1;
		
	}
	

}
