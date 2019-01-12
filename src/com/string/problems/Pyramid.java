package com.string.problems;

/**
 * Print a pyramid of height n.  Make sure there are spaces on the left and right side.
 * @author knguyen
 *
 */

public class Pyramid {
	
	public static void main(String[] args) {
		
		System.out.println(pyramid(3));
		
		
	}

	/*
	 * n = 1: size = 1;            #
	 * n = 2: size = 3;           ###
	 * n = 3: size = 5;          #####
	 * n = 4: size = 7;         #######
	 * 
	 * size = 2 * n - 1
	 */
	
	public static String pyramid(int n) {
		
		String returnValue = "";
		
		int size = 2 * n - 1;
		int mid = size / 2;
		
		System.out.println("size: " + size + " mid: " + mid);
		
		for (int row = 0; row < n; row++) {
			
			char[] charArray = new char[size];
			
			for (int col = 0; col < charArray.length; col++) {
				System.out.println("COL: " + col + " ROW: " + row + " MID: " + mid);
				if ((mid - row <= col) && (mid + row >= col)) {
					charArray[col] = '#';
				}
			}

			returnValue += new String(charArray) + "\n";
			System.out.print("\n");
			
		}
		
		return returnValue;
		
	}
	
}
