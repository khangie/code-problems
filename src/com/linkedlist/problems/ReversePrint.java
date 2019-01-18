package com.linkedlist.problems;

import com.linkedlist.datastructures.SingleLinkedList;
import com.linkedlist.datastructures.SingleNode;

/**
 * Print a linked list in reverse order
 * @author knguyen
 *
 */

public class ReversePrint {

	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		list.addToFront(4);
		list.addToFront(5);
		list.printList();
		
		reversePrint(list.head);
		
	}
	
	public static void reversePrint(SingleNode node) {
		
		if (node == null) {
			return;
		}
		
		reversePrint(node.getNext());
		System.out.print(node.getValue() + " -> ");
		
	}
	
}
