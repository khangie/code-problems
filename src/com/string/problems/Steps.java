package com.string.problems;

/**
 * Print a set of steps based on the number n.  Make sure the steps have spaces on the right hand side.
 * @author knguyen
 *
 */

public class Steps {

	public static void main(String[] args) {

		System.out.println(steps(3));
		
	}

	public static String steps(int n) {
		
		String returnValue = "";
		
		char[] charArray = new char[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				charArray[j] = '#';
			}
			returnValue += new String(charArray) + "\n";
		}
		
		return returnValue;
	}
	
}
