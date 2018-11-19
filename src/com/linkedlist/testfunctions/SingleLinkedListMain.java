package com.linkedlist.testfunctions;

import com.linkedlist.datastructures.SingleLinkedList;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		
		SingleLinkedList linkedList = new SingleLinkedList();
		
		linkedList.addToFront(1);
		linkedList.addToFront(3);
		linkedList.addToFront(5);
		linkedList.printList();
		
		linkedList.removeFromFront();
		linkedList.printList();
		
	}
	
}
