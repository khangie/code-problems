package com.dynamic.problems;

/**
 * Given an integer representing a given amount of change, write a
 * function to compute the total number of coins required to make
 * that amount of change.
 * @author knguyen
 *
 */

public class MakeChange {

	public static void main(String[] args) {
		
		int[] coins = {25, 10, 5, 1};
		int x = 32;

		int memo[] = new int[x];
		for (int i = 0; i < memo.length; i++) {
			memo[i] = -1;
		}
		memo[0] = 0;
		
		System.out.println("makeChange");
		System.out.println(makeChange(coins, x));
		
		System.out.println("makeChangeDynamic");
		System.out.println(makeChangeDynamic(coins, x, memo));

		System.out.println("makeChangeDynamicReverse");
		System.out.println(makeChangeDynamicReverse(coins, x));
		
	}
	
	/*
	 * Brute force solution (recursive)
	 * O(X^C)
	 */
	
	public static int makeChange(int[] coins, int x) {
		
		if (x == 0) {
			return 0;
		}
		
		// Default to the worst case x number of coins
		int minCoins = x;
		
		// Find the solution that gives the minimum amount of change
		for (int coin : coins) {
			
			// Remainder after taking out the coin
			int remainder = x - coin;
			
			if (remainder >= 0) {
				
				// Find the change for the sub problem
				int subMinCoins = makeChange(coins, remainder);
				
				// Add back one coin
				if (minCoins > subMinCoins + 1) {
					minCoins = subMinCoins + 1;
				}
				
			}
			
		}
		
		return minCoins;
		
	}

	/*
	 * Top down dynamic solution (recursive)
	 * O(X*C)
	 */
	
	public static int makeChangeDynamic(int[] coins, int x, int[] memo) {
		
		if (x == 0) {
			return 0;
		}
		
		// Default to the worst case x number of coins
		int minCoins = x;
		
		// Find the solution that gives the minimum amount of change
		for (int coin : coins) {
			
			// Remainder after taking out the coin
			int remainder = x - coin;
			
			if (remainder >= 0) {
				
				// Find the change for the sub problem
				int subMinCoins;
				if (memo[remainder] != -1) {
					subMinCoins = memo[remainder];
				} else {
					subMinCoins = makeChangeDynamic(coins, remainder, memo);
					memo[remainder] = subMinCoins;
				}
					
				// Add back to subMinCoins
				if (minCoins > subMinCoins + 1) {
					minCoins = subMinCoins + 1;
				}
				
			}
			
		}
		
		return minCoins;
		
	}

	/*
	 * Bottom up dynamic solution (iterative)
	 * O(X*C)
	 */
	
	public static int makeChangeDynamicReverse(int[] coins, int x) {
	
		// Initialize cache
		int[] memo = new int[x + 1];
		memo[0] = 0;
		
		// The value i represents sub solution currently being evaluated
		for (int i = 1; i <= x; i++) {
			
			// Start with the worst case
			int minCoins = x;
		
			// Try removing each coin from the total
			for (int coin : coins) {
				
				// Calculate the remainder after taking out the coin
				int remainder = i - coin;
				
				if (remainder >= 0) {
					
					int subMinCoins = memo[remainder];
					
					// Add 1 back to subMinCoins
					if (minCoins > subMinCoins + 1) {
						minCoins = subMinCoins + 1;
					}
				}
				
			}
			
			memo[i] = minCoins;
				
		}
		
		return memo[x];
		
	}
	
}
