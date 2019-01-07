package com.array.problems;

import com.linkedlist.datastructures.SingleLinkedList;
import com.linkedlist.datastructures.SingleNode;

/**
 * Partition a linked list so that values larger than the given value are to the right and values less are to the left.
 * @author knguyen
 *
 */

public class Partition {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addToFront(1);
		linkedList.addToFront(2);
		linkedList.addToFront(10);
		linkedList.addToFront(5);
		linkedList.addToFront(8);
		linkedList.addToFront(5);
		linkedList.addToFront(3);
		linkedList.printList();
		
		SingleNode head = partition(linkedList.head, 5);
		linkedList.printList(head);
		
	}

	public static SingleNode partition(SingleNode head, int x) {
		
		SingleNode curr = head.getNext();
		SingleNode prev = head;
		SingleNode next = null;
		
		while (curr != null) {
			
			if (curr.getValue() < x) {
				next = curr.getNext();
				curr.setNext(head);
				head = curr;
				prev.setNext(next);
				curr = next;
			} else {
				prev = curr;
				curr = curr.getNext();
			}
			
		}
		
		return head;
		
	}
	
}
