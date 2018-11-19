package com.linkedlist.testfunctions;

import com.linkedlist.datastructures.DoubleLinkedList;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		
		DoubleLinkedList linkedList = new DoubleLinkedList();
		
		linkedList.addToFront(1);
		linkedList.addToFront(3);
		linkedList.addToFront(5);
		linkedList.printList();
		
		linkedList.removeFromFront();
		linkedList.printList();
		
	}
	
}
