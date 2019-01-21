package com.array.problems;

import java.util.HashSet;
import java.util.Set;

public class FindPairsAddingToSum {

	public static void main(String[] args) {

		int[] array = {1, 5, 7, -1, 5};
		int sum = 6;
		
		System.out.println(findPairs(array, sum));
		System.out.println(findPairsDynamic(array, sum));

	}

	public static int findPairs(int[] array, int sum) {
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					count++;
				}
			}
		}
		
		return count;
		
	}
	
	public static int findPairsDynamic(int[] array, int sum) {
		
		int count = 0;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			int val = array[i];
			int complement = sum - val;
			if (set.contains(complement)) {
				count++;
			} else {
				set.add(array[i]);
			}
		}
		
		return count;
		
	}
	
	
	
}
