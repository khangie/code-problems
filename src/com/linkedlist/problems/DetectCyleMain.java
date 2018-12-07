package com.linkedlist.problems;

import com.linkedlist.datastructures.SingleNode;

/**
 * Problem
 * - Detect a cycle in a linked list
 * @author knguyen
 *
 */

public class DetectCyleMain {

	public boolean hasCycle(SingleNode head) {
		
		if (head == null) {
			return false;
		}
		
		SingleNode slow = head;
		SingleNode fast = head.getNext();
		
		// If there is a loop, eventually, fast will overtake slow
		while (slow != null && fast != null && fast.getNext() != null) {
			
			if (slow == fast) {
				return true;
			}
			
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
		}
		
		return false;
		
	}
	
}
