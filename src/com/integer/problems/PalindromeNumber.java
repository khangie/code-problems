package com.integer.problems;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * @author knguyen
 *
 */

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));

	}

	public static boolean isPalindrome(int x) {
		
		int original = x;
		
		if (x < 0) {
			return false;
		}
		
		int reversed = 0;
		
		while (x != 0) {
			int remainder = x % 10;
			x = x / 10;
			reversed = reversed * 10 + remainder;
		}
		
		if (original == reversed) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
