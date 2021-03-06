package com.linkedlist.problems;

import com.linkedlist.datastructures.SingleLinkedList;
import com.linkedlist.datastructures.SingleNode;

public class ReverseLinkedListMain {

	/**
	 * Problem:
	 * - Reverse a linked list
	 * 
	 * Assumptions:
	 * - List is linear
	 * - List may or may not be sorted
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		list.addToFront(4);
		list.addToFront(5);
		list.printList();
		
		list.reverseLinkedListIterative();
		list.printList();
		
		list.reverseLinkedListRecursive(list.head);
		list.printList();
		
	}
	
}
