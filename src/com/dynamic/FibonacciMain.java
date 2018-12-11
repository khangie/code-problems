package com.dynamic;

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
		
		System.out.println(fib(6));
		System.out.println(fibDynamic(6));
		
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
	
	public static int fibDynamic(int n) {
		
		int[] f = new int[n];
		int i;
		
		f[0] = 1;
		f[1] = 1;
		
		for (i = 2; i < n; i++) {
			f[i] = f[i -1] + f[i - 2];
		}
		
		return f[n - 1];
		
	}
	
	
}
