package com.array.problems;

import java.util.HashSet;

public class FindTwoIntegersMain {

	/**
	 * Problem:
	 * Find two integers that multiply to 20
	 * 
	 * @param args
	 */
	
	public static void main (String[] args) {
		
		int[] array = new int[] {2, 4, 1, 6, 5, 40, -1};
		int[] result = search(array);
		
		if (result != null) {
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		} else {
			System.out.println("No results found");
		}
	}
	
	static int[] search(int[] array) {
		
		if (array.length <= 1) {
			return null;
		}
		
		HashSet<Integer> cache = new HashSet<Integer>();
		
		int i = 0;
		
		while (i <= array.length - 2) {
			int value = 20 / array[i];
			if  (cache.contains(value) && array[i] * value == 20) {
				return new int[] {array[i], value};
			} else {
				int j = i + 1;
				while (j <= array.length - 1) {
					if (array[i] * array[j] == 20) {
						return new int[] {array[i], array[j]};
					}
					cache.add(array[j]);
					j++;
				}
			}
			cache.add(array[i]);
			i++;
		}
		
		return null;
		
	}
	
}
