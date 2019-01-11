package com.string.problems;

/**
 * Given a string, return the character that is most used
 * @author knguyen
 *
 */

public class MaxChar {

	public static void main(String[] args) {
	
		String input = "abcccccd";
		System.out.println(maxChar(input));
		
	}
	
	public static char maxChar(String input) {
		
		int[] letters = new int[128];
		
		for (int i = 0; i < input.length(); i++) {
			int charVal = input.charAt(i);
			System.out.println("CHARVAL: " + charVal);
			letters[charVal]++;
		}
		
		int maxIndex = 0;
		int maxValue = 0;
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > maxValue) {
				maxIndex = i;
				maxValue = letters[i];
			}
		}
		
		char returnValue = (char) maxIndex;
		
		return returnValue;
	}
	
	
}
