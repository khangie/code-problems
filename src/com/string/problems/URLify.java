package com.string.problems;

public class URLify {

	/**
	 * Replace spaces with %20
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String input = "Mr John Smith    ";
		int trueLength = 13;
		
		System.out.println(convertToURL(input, trueLength));
		
	}

	public static String convertToURL(String input, int trueLength) {
		
		char[] charArray = input.toCharArray();
		
		int i = charArray.length - 1;
		int j = trueLength - 1;
		
		while (i >= 0) {
			
			if (charArray[j] == ' ') {
				charArray[i] = '0';
				charArray[i-1] = '2';
				charArray[i-2] = '%';
				i = i - 3;
			} else {
				charArray[i] = charArray[j];
				i--;
			}

			j--;
			
		}
		
		return new String(charArray);
		
	}
	
}
