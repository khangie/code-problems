package com.array.problems;

public class SquareSubMatrix {

	public static void main(String[] args) {

		int[][] array1 = { { 0, 1, 0, 0 },
				   		   { 1, 1, 1, 1},
				   		   { 0, 1, 1, 0} };

		int[][] array2 = { { 1, 1 },
				           { 1, 1 } };
		
		
		System.out.println(squareSubMatrix(array2));
		
	}

	public static int squareSubMatrix(int[][] array) {
		
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int solution = squareSubMatrix(array, i, j);
				if (solution > max) {
					max = solution;
				}
			}
		}
		
		return max;
		
	}
	
	public static int squareSubMatrix(int[][] array, int i, int j) {
		
		// If value is 0, then it is not part of the valid sub matrix
		if (array[i][j] == 0) {
			return 0;
		}
		
		// Base case at the bottom or right of matrix (at this point, the value is already 1)
		if ((i == array.length - 1) || (j == array.length - 1)) {
			return 1;
		}
		
		// Find the sub solutions for the bottom, right, and bottom right
		int bottomSolution = squareSubMatrix(array, i + 1, j);
		int rightSolution = squareSubMatrix(array, i, j + 1);
		int bottomRightSolution = squareSubMatrix(array, i + 1, j + 1);
		
		// A larger square can be made by taking the minimum of the all sub solutions
		int minSubSolution = Math.min(Math.min(bottomSolution, rightSolution), bottomRightSolution);
		
		// Add 1 to the minimum sub solution which represents the bigger matrix
		return minSubSolution + 1;
		
	}
	
}

	
	

