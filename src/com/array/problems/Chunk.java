package com.array.problems;

/**
 * Divide an array into chunks.
 * @author knguyen
 *
 */

public class Chunk {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		int chunkSize = 3;
		
		int[][] result = chunk(array, chunkSize);
		
		System.out.print("\n");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("i: " + i);
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.print("\n");
		}
		
	}

	public static int[][] chunk(int[] array, int chunkSize) {
		
		// Calculate the size of the result array
		int numRows = array.length / chunkSize;
		if (array.length % chunkSize != 0) {
			numRows++;
		}
		
		int[][] result = new int[numRows][chunkSize];
		int resultIndex = 0;
		
		int[] subArray = new int[chunkSize];
		
		for (int i = 0; i < array.length; i++) {
		
			int subIndex = i % chunkSize;
			
			if (subIndex == 0) {
				System.out.println("New array");
				subArray = new int[chunkSize];
				result[resultIndex] = subArray;
				resultIndex++;
			}
			
			subArray[subIndex] = array[i];
			
			System.out.println("i: " + i + " subIndex: " + subIndex + " val: " + array[i]);
		
		}
		
		return result;
		
	}
	
}
