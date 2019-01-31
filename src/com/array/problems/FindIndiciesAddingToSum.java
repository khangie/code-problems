package com.array.problems;

import java.util.HashMap;
import java.util.Map;

public class FindIndiciesAddingToSum {

	public static void main(String[] args) {

		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] solution = findSums(nums, target);
		System.out.println(solution[0] + " " + solution[1]);
		
		int[] solution2 = findSums(nums, target);
		System.out.println(solution2[0] + " " + solution2[1]);

	}
	
	/*
	 * 2, 7, 11, 15
	 * ^  ^
	 * i  j
	 * 
	 */
	
	
	public static int[] findSums(int[] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[]{0, 0};
		
	}

	
	public static int[] findSumsDynamic(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {i, map.get(complement)};
			} else {
				map.put(nums[i], i);
			}
		}
		
		return new int[] {0, 0};
		
	}
	
}
