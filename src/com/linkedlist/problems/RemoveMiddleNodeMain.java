package com.linkedlist.problems;

import com.linkedlist.datastructures.SingleLinkedList;
import com.linkedlist.datastructures.SingleNode;

public class RemoveMiddleNodeMain {

	/**
	 * Problem statement:
	 * - Remove the middle node from an unsorted linked list
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addToFront(3);
		linkedList.addToFront(1);
		linkedList.addToFront(5);
		linkedList.addToFront(2);
		linkedList.addToFront(6);
		linkedList.addToFront(8);
		linkedList.printList();
		
		SingleNode node = linkedList.removeMiddleNode();
		System.out.println("Removed node = " + node.getValue());
		linkedList.printList();
		
	}
	
}
