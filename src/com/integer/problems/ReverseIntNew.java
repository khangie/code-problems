package com.integer.problems;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Return 0 if overflow. 
 * 
 * @author knguyen
 *
 */

public class ReverseIntNew {

	public static void main(String[] args) {

		// 123 = 1 * 10^2 + 2*10^1 + 3*10^0
		// 321 = 3 * 10^2 + 2*10^1 + 1*10^0
		
		
		// 123 / 10 = 12, 123 % 10 = 3
		// 12 / 10 = 1, 12 % 10 = 2;
		// 1 / 10 = 0, 1 % 10 = 1;
		
		int num = 123;
		System.out.println(reverseInt(num));
		
		num = -123;
		System.out.println(reverseInt(num));
		
		num = 1534236469;
		System.out.println(reverseInt(num));
		
	}

	public static int reverseInt(int x) {
		
		long longVal = 0;
		
		while (x != 0) {
			int remainder = x % 10;
			x = x / 10;
			longVal = longVal * 10 + remainder;
		}
		
		int returnVal = (int) longVal;
		
		if (longVal == returnVal) {
			return returnVal;
		} else {
			return 0;
		}
		
	}
	
}
