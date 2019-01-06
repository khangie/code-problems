package com.string.problems;

public class CompressString {

	public static void main(String[] args) {

		System.out.println(compressString("aabcccccaa"));

	}

	public static String compressString(String input) {
		
		StringBuilder builder = new StringBuilder();
		
		char currChar = input.charAt(0);
		int count = 1;
		
		builder.append(currChar);
		
		for (int i = 1; i < input.length(); i++) {
			
			if (input.charAt(i) == currChar) {
				count++;
			} else {
				currChar = input.charAt(i);
				builder.append(count);
				builder.append(currChar);
				count = 1;
			}
			
		}
		
		// Account for count of last character at the end
		builder.append(count + 1);
		
		String newString = builder.toString();
		
		if (newString.length() < input.length()) {
			return newString;
		} else {
			return input;
		}
		
	}
	
}
