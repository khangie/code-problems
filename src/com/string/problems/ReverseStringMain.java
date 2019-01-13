package com.string.problems;

import java.util.Stack;

public class ReverseStringMain {

	public static void main(String[] args) {

		String input = "Hello";
		
		System.out.println(input);
		System.out.println(reverseString(input));
		System.out.println(reverseString2(input));
		System.out.println(reverseString3(input));

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
	
	public static String reverseString2(String input) {
		
		String reversed = "";
		
		for (int i = 0; i < input.length(); i++) {
			reversed = input.charAt(i) + reversed;
		}
		
		return reversed;
	}
	
	public static String reverseString3(String input) {
		
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
	
}
