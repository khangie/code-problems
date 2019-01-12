package com.string.problems;

/**
 * Capitalize all the words in a sentence
 * @author knguyen
 *
 */

public class Capitalize {

	public static void main(String[] args) {

		String input = "this is a test";
		System.out.println(capitalize(input));
		System.out.println(capitalize2(input));
		
	}
	
	public static String capitalize(String input) {
		
		String[] array = input.split("\\s+");
		for (int i = 0; i < array.length; i++) {
			char[] charArray = array[i].toCharArray();
			charArray[0] = Character.toUpperCase(charArray[0]);
			array[i] = new String(charArray);
		}
		
		return String.join(" ", array);
		
	}
	
	public static String capitalize2(String input) {
		
		char[] charArray = input.toCharArray();
		
		char prevChar = ' ';
		
		for (int i = 0; i < charArray.length; i++) {
			if ((prevChar == ' ') && (charArray[i] != ' ')) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			prevChar = charArray[i];
			
		}
		
		return new String(charArray);
		
	}
	
}
