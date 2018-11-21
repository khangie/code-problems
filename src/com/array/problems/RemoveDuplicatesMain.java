package com.array.problems;

public class RemoveDuplicatesMain {

	/**
	 * Problem:
	 * - Remove duplicates from an array in place
	 * - No additional data structures allowed
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
	 
		int nums[];
		int size;
		
		nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		printArray(nums, nums.length);
		size = removeDuplicates(nums);
		printArray(nums, size);
		
		System.out.print("\n");
	    
		nums = new int[]{1,2,3};
		printArray(nums, nums.length);
		size = removeDuplicates(nums);
		printArray(nums, size);
		
	}
	
    public static int removeDuplicates(int[] nums) {
        
    	if (nums.length == 0) {
    		return 0;
    	}
        
    	// i represents the location of the latest unique value
        int i = 0;
        
        // Start j one location after i
        for (int j = 1; j < nums.length; j++) {
        	if (nums[i] != nums[j]) {
        		// Increment i because a new unique value is found
        		i++;
        		nums[i] = nums[j];
        	}
        }
        
        // The size of the final array is the index at i + 1
        return i + 1;
    }
	
    public static void printArray(int[] nums, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print("\n");
    }

}
