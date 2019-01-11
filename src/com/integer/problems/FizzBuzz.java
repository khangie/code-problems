package com.integer.problems;

public class FizzBuzz {

	public static void main(String[] args) {
		
		fizzBuzz(30);
		
	}
	
	public static void fizzBuzz(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print("i: " + i + " ");
			
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.print("fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else if (i % 3 == 0) {
				System.out.print("fizz");
			}
			
			System.out.print("\n");
			
		}
		
	}
	
}
