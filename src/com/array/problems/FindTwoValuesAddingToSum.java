package com.array.problems;

import java.util.HashSet;
import java.util.Set;

public class FindTwoValuesAddingToSum {

	public static void main(String[] args) {

		System.out.println(foundSum(new int[]{1,2,3,9}, 8));
		System.out.println(foundSum(new int[]{1,2,4,4}, 8));
		
	}

	public static boolean foundSum(int[] array, int sum) {
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			
			// Determine the complement of the number adding to the sum
			int complement = sum - array[i];
			
			if (set.contains(complement)) {
				return true;
			} else {
				set.add(array[i]);
			}
			
		}
		
		return false;
	}
	
}
