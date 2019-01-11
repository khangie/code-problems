package com.string.problems;

/**
 * A string is a palindrome if it remains unchanged when reversed
 * @author knguyen
 *
 */

public class Palindrome {

	public static void main(String[] args) {
		
		String input1 = "dad";
		String input2 = "abc";
		
		System.out.println(isPalindrome(input1));
		System.out.println(isPalindrome(input2));
		
	}
	
	public static boolean isPalindrome(String input) {
		return input.equals(reverseString(input)); 
	}
	
	public static String reverseString(String input) {
		
		String reversedString = "";
		for (int i = 0; i < input.length(); i++) {
			reversedString = input.charAt(i) + reversedString;
		}
		
		return reversedString;
		
	}
	
}
