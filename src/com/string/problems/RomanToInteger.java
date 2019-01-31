package com.string.problems;

/**
 * Convert a roman to integer
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * @author knguyen
 *
 */

public class RomanToInteger {

	/*
	 * III = 3 = 1 + 1 + 1
	 * IV = 4 = 5 - 1
	 * IX = 9 = 10 - 1
	 * LVIII = 58 = 1 + 1 + 1 + 5 + 50
	 * MCMXCIV = 1994 = 5 - 1 + 100 - 10 + 1000 - 100 + 1000
	 * 
	 */
	
	public static void main(String[] args) {

		System.out.println(roman("III"));
		System.out.println(roman("IV"));
		System.out.println(roman("IX"));
		System.out.println(roman("LVIII"));
		System.out.println(roman("MCMXCIV"));

	}
	
	public static int roman(String s) {
		
		int total = 0;
		char prev = '0';
		
		for (int i = s.length() - 1; i >= 0; i--) {

			switch (s.charAt(i)) {
				
				case 'I': 
					if (prev == 'V' || prev == 'X') {
						total = total - 1;
					} else {
						total = total + 1;
					}
					break;
				
				case 'V': 
					total = total + 5;
					break;
			
				case 'X': 
					if (prev == 'L' || prev == 'C') {
						total = total - 10;
					} else {
						total = total + 10;
					}
					break;
				
				case 'L':
					total = total + 50;
					break;
					
				case 'C':
					if (prev == 'D' || prev == 'M') {
						total = total - 100;
					} else {
						total = total + 100;
					}
					break;
					
				case 'D':
					total = total + 500;
					break;
					
				case 'M':
					total = total + 1000;
					break;
				
			}
			
			prev = s.charAt(i);
			
		}
		
		return total;
		
	}

}
