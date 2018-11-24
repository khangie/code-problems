package com.string.problems;

public class ReverseStringMain {

	public static void main(String[] args) {

		String input = "Hello";
		
		System.out.println(input);
		System.out.println(reverseString(input));

	}

	public static String reverseString(String input) {
		
		int i = 0;
		int j = input.length() - 1;
		
		StringBuilder stringBuilder = new StringBuilder(input);
		
		while (j - i > 1) {
			char temp = input.charAt(i);
			stringBuilder.setCharAt(i, input.charAt(j));
			stringBuilder.setCharAt(j, temp);
			i++;
			j--;
		}
		
		return stringBuilder.toString();
		
	}
	
}
