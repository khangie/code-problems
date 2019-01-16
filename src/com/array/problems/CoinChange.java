package com.array.problems;

public class CoinChange {

	public static void main(String[] args) {
		
		int[] coins = {1, 5, 10, 25};
		int x = 32;
		
		System.out.println("Minimum number of coins as change");
		System.out.println(getChange(x, coins));
		
		System.out.println("Minimum number of coins as change (dynamic)");
		int[] memo = new int[x];
		for (int i = 0; i < memo.length; i++) {
			memo[i] = -1;
		}
		memo[0] = 0;
		System.out.println(getChange(x, coins));
		
	}
	
	/*
	 * Find the minimum number of coins as change
	 * O(N^2)
	 */
	
	public static int getChange (int x, int[] coins) {
		
		if (x == 0) {
			return 0;
		}
		
		// Start with the worst case of x number of coins
		int min = x;
		
		// Find the solution that gives the minimum of each of the change possibilities from the coins array
		for (int coin : coins) {
			
			// Solution is invalid if we go negative
			int remainder = x - coin;
			
			if (remainder >= 0) {
				
				// Find the sub solution for one less the number of coins
				int change = getChange(remainder, coins);
				
				// Need to add 1 to the sub solution because we subtracted it earlier
				if (min > change + 1) {
					min = change + 1;
				}
				
			}
			
			
		}
		
		return min;
		
	}
	
	/*
	 * Find the minimum number of coins as change (dynamic)
	 * O(N)
	 */
	
	public static int getChangeDynamic (int x, int[] coins, int[] memo) {
		
		if (x == 0) {
			return 0;
		}
		
		// Start with the worst case of x number of coins
		int min = x;
		
		// Find the solution that gives the minimum of each of the change possibilities from the coins array
		for (int coin : coins) {
			
			// Solution is invalid if we go negative
			int remainder = x - coin;
			
			if (remainder >= 0) {
				
				// Find the sub solution for one less the number of coins
				
				int change;
				if (memo[remainder] != -1) {
					change = memo[remainder];
				} else {
					change = getChangeDynamic(remainder, coins, memo);
					memo[remainder] = change;
				}
					
				// Need to add 1 to the sub solution because we subtracted it earlier
				if (min > change + 1) {
					min = change + 1;
				}
				
			}
			
			
		}
		
		return min;
		
	}
	
}
