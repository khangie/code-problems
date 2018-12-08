package com.array.problems;

import java.util.Arrays;

/**
 * Find the number of pairs of socks represented by integers
 *
 */

public class FindPairsMain {

	public static void main(String[] args) {
		
		int[] array = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int size = 9;
		
		System.out.println(sockMerchant(size, array));
		
	}
	
    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);

        int i = 0;
        int j = 1;
        
        int count = 0;
        
        while (i < n && j < n) {
        	if (ar[i] == ar[j]) {
        		count++;
        		i = j + 1;
        		j = i + 1;
        	} else {
        		i = j;
        		j = j + 1;
        	}
        }
        	
        return count;

    }
	
}
