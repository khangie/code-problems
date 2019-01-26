package com.dynamic.problems;

public class Knapsack {

	public static void main(String[] args) {
		Item[] items = {new Item(2, 6), new Item(2, 10), new Item(3, 12)};
		int maxWeight = 5;
		
		System.out.println(knapsack(items, maxWeight));
		
	}
	
	public static int knapsack(Item[] items, int maxWeight) {
		return knapsack(items, 5, 0);
	}
	
	public static int knapsack(Item[] items, int remainingWeight, int itemNumber) {
		
		// If we have gone through all of the items, then return
		if (itemNumber == items.length) {
			return 0;
		}
		
		// If item is too big for remaining weight, skip it
		if (remainingWeight - items[itemNumber].weight < 0) {
			return knapsack(items, remainingWeight, itemNumber + 1);
		}
		
		// Return the maximum of including and not including the current item
		return Math.max(
				
			// Including
			knapsack(items, remainingWeight - items[itemNumber].weight, itemNumber + 1) + items[itemNumber].value, 
			
			// Not including
			knapsack(items, remainingWeight, itemNumber + 1)
		
		);
		
	}


}

class Item {
	
	int weight;
	int value;
	
	public Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}