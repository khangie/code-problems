package com.dynamic.problems;

/**
 * Implement a Fibonacci sequence
 * 
 * Note the following
 * - fib(0) = 0;
 * - fib(1) = 1;
 * - fib(n) = fib(n-1) + fib(n-2)
 *
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 6;
		
		System.out.println(fib(n));
		System.out.println(fibDynamicIterative(n));
		
		int[] f = new int[n + 1];
		for (int i = 0; i < f.length; i++) {
			f[i] = -1;
		}
		System.out.println(fibDynamicRecursive(n, f));
		
		System.out.print("\n");

		System.out.println("fibInterativeNew");
		System.out.println(fibInterativeNew(n));
		
		System.out.println("fibIterativeNewOptimized");
		System.out.println(fibIterativeNewOptimized(n));
		
		System.out.println("fibDynamicNew");
		System.out.println(fibDynamicNew(n,f));
		
		
	}

	/**
	 * Non-dynamic recursive implementation
	 * 
	 * Time complexity
	 * O(n2)
	 * 
	 * Space complexity
	 * O(n)
	 * 
	 * @param n
	 * @return
	 */
	
	public static int fib(int n) {
		
		if (n == 0) {
			return 0;
		} else if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			return fib(n - 1) + fib (n - 2);
		}
		
	}
	
	/**
	 * Dynamic iterative implementation
	 * 
	 * Time complexity
	 * O(n)
	 * 
	 * Space complexity
	 * O(n)
	 * 
	 * @param n
	 * @return
	 */
	
	public static int fibDynamicIterative(int n) {
		
		int[] f = new int[n + 1];
		
		f[0] = 0;
		f[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		
		return f[n];
		
	}
	
	/**
	 * Dynamic recursive implementation
	 * 
	 * Time complexity
	 * O(n)
	 * 
	 * Space complexity
	 * O(n)
	 * 
	 * @param n
	 * @param f
	 * @return
	 */
	
	public static int fibDynamicRecursive(int n, int[] f) {
		
		System.out.println("n: " + n + " f[n]: " + f[n]);
		
		// If value does not exist, calculate it and save it
		if (f[n] < 0) {
			if (n == 0) {
				f[n] = 0;
				System.out.println("Setting f[" + n + "] = " + f[n]);
			} else if ((n == 1) || (n == 2)) {
				f[n] = 1;
				System.out.println("Setting f[" + n + "] = " + f[n]);
			} else {
				int num1 = n - 1;
				int num2 = n - 2;
				System.out.println("Calculating fib[" + num1 + "] + fib[" + num2 + "]");
				f[n] = fibDynamicRecursive(n - 1, f) + fibDynamicRecursive(n - 2, f);
				System.out.println("Setting f[" + n + "] = " + f[n]);
			}
		}
		
		// Return the saved value
		return f[n];
		
	}
	
	/*
	 * Bottom up approach (iterative)
	 */
	
	public static int fibInterativeNew(int n) {
		
		int[] memo = new int[n+1];
		memo[0] = 0;
		memo[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		
		return memo[n];
		
	}
	
	public static int fibIterativeNewOptimized(int n) {
		
		int n0 = 0;
		int n1 = 1;
		
		if (n == 0) {
			return n0;
		}
		
		if (n == 1) {
			return n1;
		}
		
		int fib = 0;;
		
		for (int i = 2; i <= n; i++) {
			fib = n1 + n0;
			n0 = n1;
			n1 = fib;
		}
		
		return fib;
		
	}
	
	
	/*
	 * Top-down approach (recursive)
	 */
	
	public static int fibDynamicNew(int n, int memo[]) {
		
		if (memo[n] >= 0) {
			return memo[n];
		}
		
		int val = fibDynamicNew(n - 1 , memo) + fibDynamicNew(n - 2, memo);
		memo[n] = val;
		
		return memo[n];
		
		
	}
	
}
