package com.linkedlist.datastructures;

public class DoubleLinkedList {

	public DoubleNode head;
	public DoubleNode tail;
	
	/**
	 * Adds a node to the front of the list
	 * 
	 * Implementation
	 * 1) If head == null, then the list is empty
	 *    a) Set tail to new node
	 *    b) Set head to new node
	 *
	 * 2) If head != null
	 * 	  a) Create a new node
     *    b) Set prev of head to the new node
	 *    c) Set next of the new node to head
	 *    d) Set head to the new node
	 * 
	 * @param value value to be inserted
	 */
	
	public void addToFront(int value) {
		
		DoubleNode node = new DoubleNode(value);
		
		if (head == null) {
			tail = node;
			head = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
			head = node;
		}
		
	}
	
	/**
	 * Removes a node from the front of the list
	 * 
	 *  1) If head == null, then the list is empty
     *     a) return null;
	 *  
     *  2) If head.getNext() == null, then list only has one node
	 *     a) Set head = null
	 *     a) Set tail = null
	 *  
	 *  3) If head.getNext() != null, then list has more than one node
	 *     a) Create a temporary node from head
	 *     b) Set head to next node
	 *     c) Set prev of head to null
     *     d) Set next of temporary node to null
	 * 
	 * @return node that was removed
	 */
	
	public DoubleNode removeFromFront() {
			
		if (head == null) {
			return null;
		}
		
		DoubleNode node = head;
		if (head.getNext() == null) {
			head = null;
			tail = null;
		} else {
			head = node.getNext();
			head.setPrev(null);
			node.setNext(null);
		}
		
		return node;
		
	}
	
	public void printList() {
		DoubleNode node = head;
		while (node != null) {
			System.out.print(node.getValue() + " -> ");
			node = node.getNext();
		}
		
		System.out.println("\n");
		
	}
	
	
}
