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

public class FibonacciMain {

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
		
		FibonacciDynamic fibonacciDynamic = new FibonacciDynamic();
		System.out.println(fibonacciDynamic.fibonacci(6));
		
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
		
		int[] f = new int[n];
		int i;
		
		f[0] = 1;
		f[1] = 1;
		
		for (i = 2; i < n; i++) {
			f[i] = f[i -1] + f[i - 2];
		}
		
		return f[n - 1];
		
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
	
}
