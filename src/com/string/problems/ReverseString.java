package com.string.problems;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Hello";
		
		System.out.println(input);
		
		System.out.println("reverseStringInPlace1");
		System.out.println(reverseStringInPlace1(input));
		
		System.out.println("reverseStringInPlace2");
		System.out.println(reverseStringInPlace2(input));
		
		System.out.println("reverseStringIterative");
		System.out.println(reverseStringIterative(input));
		
		System.out.println("reverseStringStack");
		System.out.println(reverseStringStack(input));
		
		System.out.println("reverseStringRecursive");
		System.out.println(reverseStringRecursive(input));

	}

	public static String reverseStringInPlace1(String input) {
		
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
	
	public static String reverseStringInPlace2(String input) {
		
		char[] charArray = input.toCharArray();
		
		int i = 0;
		int j = charArray.length - 1;
		
		while (i < j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		
		return new String(charArray);
		
	}
	
	public static String reverseStringIterative(String input) {
		
		String reversed = "";
		
		for (int i = 0; i < input.length(); i++) {
			reversed = input.charAt(i) + reversed;
		}
		
		return reversed;
	}
	
	public static String reverseStringStack(String input) {
		
		String reversed = "";
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			reversed += stack.pop();
		}
		
		return reversed;
		
	}
	
	/*
	 * reverseString("Hello") => reverseString("ello") + "H")
	 * reverseString("o") => "o";
	 * 
	 */
	
	public static String reverseStringRecursive(String input) {
	 
		if (input.length() <= 1) {
	        return input;
	    }
	    
		return reverseStringRecursive(input.substring(1)) + input.charAt(0);
	}
	
}
