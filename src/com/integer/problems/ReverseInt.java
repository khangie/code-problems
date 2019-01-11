package com.integer.problems;

public class ReverseInt {

	public static void main(String[] args) {

		// 123 = 1 * 100 + 2 * 10 + 3 * 1
		int val = 123;
		
		System.out.println(reverseInt(val));
		
	}
	
	public static int reverseInt(int val) {
		
		long reversed = 0;
		
		while (val != 0) {

			int remainder = val % 10;
			reversed = reversed * 10 + remainder;		
			val = val / 10;
		}
		
		if ((reversed > Integer.MAX_VALUE) || (reversed < Integer.MIN_VALUE)) {
			return 0;
		}
		
		return (int) reversed;
		
	}
	
}
