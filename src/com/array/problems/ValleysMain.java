package com.array.problems;

/**
 * Find the number of valleys below sea level
 *
 */

public class ValleysMain {

	public static void main(String[] args) {
	
		String path = "UDDDUDUU";
		int length = 8;
		
		System.out.println(countingValleys(length, path));
		
	}

    static int countingValleys(int n, String s) {

    	int currAltitude = 0;
    	int prevAltitude = 0;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
    		
    		char step = s.charAt(i);
    		
    		prevAltitude = currAltitude;
    		
    		if (step == 'U') {
    			currAltitude++;
    		} else {
    			currAltitude--;
    		}
    		
    		if (currAltitude == 0 && prevAltitude == -1) {
    			count++;
    		}
    		
    	}
    	
    	return count;
    
    }
	
}
