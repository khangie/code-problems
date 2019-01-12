package com.string.problems;

/**
 * Return the number of vowels in a string
 * @author knguyen
 *
 */

public class Vowels {

	public static void main(String[] args) {

		String input = "this is a test";
		System.out.println(numVowels(input));
		
	}

	public static int numVowels(String input) {
		
		char[] charArray = input.toCharArray();
		
		int numVowels = 0;
		
		for (int i = 0; i < charArray.length; i++) {
	
			String letter = Character.toString(charArray[i]);
			if (letter.matches("[aeiou]")) {
				numVowels++;
			}
			
		}
		
		return numVowels;
		
	}
	
}
