package com.quicksort;

public class QuickSortMain {

	public static void main(String[] args) {
		
		int[] array = new int[] {9, 9, 2, 6, 4, 3, 5, 1};
//		int[] array = new int[] {6, 3, 2, 1, 9, 5, 7, 8, 15};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		quicksort(array, 0, array.length - 1);
		
		System.out.print("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void quicksort(int[] array, int left, int right) {
		
		if (left >= right) {
			return;
		}
		
		int centerIndex = (left + right) / 2;
		int pivot = array[centerIndex];
		
		int partitionIndex = partition(array, left, right, pivot);
		
		quicksort(array, left, partitionIndex - 1);
		quicksort(array, partitionIndex, right);
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		
		System.out.print("\nBeginning Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		
		while (left <= right) {
			
			// Look for elements that are out of order
			while (array[left] < pivot) {
				left++;
			}
			
			while (array[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		
		System.out.print("Ending Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		
		// Return the partition point
		System.out.println("PartitionIndex: " + left);
		return left;
		
	}
	
	public static void swap(int[] array, int left, int right) {
		
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
	}
	
}
