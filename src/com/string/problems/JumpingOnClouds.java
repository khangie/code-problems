package com.string.problems;

/**
 * Jumping on clouds
 * - Can jump up to two steps on a "0" value
 * - Cannot jump on a "1" value
 * - Find the miniumum number of jumps
 *
 */

public class JumpingOnClouds {

	public static void main(String[] args) {
		
		int[] c = new int[] {0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(c));
		
	}
	
    static int jumpingOnClouds(int[] c) {

    	int count = 0;
    	
    	int i = 0;
    	
    	while (i < c.length) {
    		
    		int jump = i + 2;
    		int step = i + 1;
    		
    		if (jump < c.length && c[jump] == 0) {
    			// Try to jump two steps first onto a "0"
    			count++;
    			i++;
    		} else if (step < c.length && c[step] == 0) {
    			// Jump one step onto a "0"
    			count++;
    		}
    		
    		i++;
    		
    	}
    	
    	return count;
    	
    }
	
	
}
