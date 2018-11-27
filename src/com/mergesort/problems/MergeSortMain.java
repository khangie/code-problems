package com.mergesort.problems;

/**
 * Problem:
 * Implement a merge sort algorithm
 * 
 * @author knguyen
 *
 */

public class MergeSortMain {
	
	public static void main(String[] args) {
		
		int [] array = new int[] {20, 35, -15, 7, 1, 22};
		int leftStart = 0;
		int rightEnd = array.length - 1;
		
		mergeSort(array, leftStart, rightEnd);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void mergeSort(int[] array, int leftStart, int rightEnd) {
		
		if (leftStart >= rightEnd) {
			return;
		}
		
		// Find out where to split the array
		int mid = (leftStart + rightEnd) / 2;
		
		// Sort the left half of the array
		mergeSort(array, leftStart, mid);
		
		// Sort the right half of the array
		mergeSort(array, mid + 1, rightEnd);
		
		// By this point, the left and right sides should already be sorted so we merge them together
		mergeHalves(array, leftStart, rightEnd);
	}
	
	public static void mergeHalves(int[] array, int leftStart, int rightEnd) {
		
		// Determine the bounds for the left and right arrays
		int mid = (leftStart + rightEnd) / 2;
		int leftEnd = mid;
		int rightStart = mid + 1;
		
		// Create a new temp array to store the merged values
		int[] tempArray = new int[rightEnd - leftStart + 1];
		
		// Initialize the indexes
		int leftIndex = leftStart;
		int rightIndex = rightStart;
		int tempIndex = 0;
		
		// Perform merge until either leftIndex or rightIndex reach the end of the bounds
		while ((leftIndex <= leftEnd) && (rightIndex <= rightEnd)) {
			if (array[leftIndex] <= array[rightIndex]) {
				tempArray[tempIndex] = array[leftIndex];
				leftIndex++;
			} else {
				tempArray[tempIndex] = array[rightIndex];
				rightIndex++;
			}
			tempIndex++;
		}
		
		/*
		 * Note that only one of the following two function will execute because either leftIndex or rightIndex would have reached the bounds already
		 */
		
		// Copy the remaining items from leftArray into the tempArray
		System.arraycopy(array, leftIndex, tempArray, tempIndex, leftEnd - leftIndex + 1);
		
		// Copy the remaining items from rightArray into the tempArray
		System.arraycopy(array, rightIndex, tempArray, tempIndex, rightEnd - rightIndex + 1);
		
		/*
		 * Copy the sorted contents of the tempArray back into the original array
		 */
		
		System.arraycopy(tempArray, 0, array, leftStart, tempArray.length);
		
	}
	
}

