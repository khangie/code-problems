package com.dynamic.problems;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {

	private Map<Integer, Integer> memoizeTable;
	
	public FibonacciDynamic() {
		memoizeTable = new HashMap<>();
		memoizeTable.put(0, 0);
		memoizeTable.put(1, 1);
	}
	
	public int fibonacci(int n) {
		
		if (memoizeTable.containsKey(n)) {
			return memoizeTable.get(n);
		}
		
		memoizeTable.put(n - 1, fibonacci(n - 1));
		memoizeTable.put(n - 2, fibonacci(n - 2));
		
		int calculatedNumber = memoizeTable.get(n - 1) + memoizeTable.get(n - 2);
		
		memoizeTable.put(n, calculatedNumber);
		
		return calculatedNumber;
		
	}
	
}
