package com.linkedlist.datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {

	public SingleNode head;
	
	/**
	 * Adds a node to the front of the list.
	 * 
	 * Time complexity O(1)
	 * 
	 * Implementation
	 * 1) Create the new node
	 * 2) Assign next to point to head
	 * 3) Assign head to point to the new node
	 * 
	 * @param value value to be added
	 */
	
	public void addToFront(int value) {
		
		SingleNode node = new SingleNode(value);
		node.setNext(head);
		head = node;
	}
	
	/**
	 * Removes a node from the front of the list 
	 * 
	 * Time complexity O(1)
	 * 
	 * Implementation
	 * 
	 * Empty List
	 * 1) If head is null, the list is empty so return null
	 * 
	 * Non-Empty List
	 * 1) Define a pointer that will point to the node that will be deleted
	 * 2) Assign head to point to the next node
	 * 3) Assign the next of the temporary node to null (optional)
	 * 
	 * @return the node that was removed
	 */
	
	public SingleNode removeFromFront() {
		
		if (head == null) {
			return null;
		}
		
		SingleNode node = head;
		head = node.getNext();
		node.setNext(null);
		
		return node;
		
	}
	
	/**
	 * Removes the middle node from a linked list
	 * 
	 * Time complexity O(n)
	 * 
	 * 1) Define a fast, slow, and prev pointer
	 * 2) Traverse the linked list with the fast pointer moving at twice the speed of the slow pointer
	 * 3) Assign the prev pointer to be one step behind the slow pointer
	 * 4) Configure the fast pointer to stop when it reaches the end of the linked list early (even number of items)
	 * 5) When the fast pointer reaches the end, delete the node at the slow pointer
	 * 6) To delete a node, set the next of the prev pointer to the next of the slow pointer
	 * 
	 * @return the node that was removed
	 * 
	 */
	
	public SingleNode removeMiddleNode() {
		
		SingleNode slow = head;
		SingleNode fast = head;
		SingleNode prev = null;
		
		while ((fast != null) && (fast.getNext() != null)) {
			prev = slow;
			slow = slow.getNext();
			fast = fast.getNext();
			fast = fast.getNext();
		}
		
		// Delete the node at the slow pointer
		prev.setNext(slow.getNext());
		slow.setNext(null);
		
		return slow;
		
	}
	
	/**
	 * Removes duplicate nodes from an unsorted linked list
	 * 
	 * Time complexity O(n)
	 * Space complexity O(n)
	 * 
	 * Implementation
	 * 1) Define a HashSet containing the record of values that were found
	 * 2) Define curr and prev pointer
	 * 3) Traverse the list with the curr pointer populating the HashSet during traverse
	 * 4) Assign the prev pointer to be one step behind the curr pointer
	 * 5) If a duplicate value is found, delete the node at the curr pointer
	 * 6) To delete a node, set the next of the prev pointer to the next of the curr pointer
	 * 
	 */
	
	public ArrayList<SingleNode> removeDuplicates() {
		
		ArrayList<SingleNode> removedNodes = new ArrayList<SingleNode>();
		
		Set<Integer> set = new HashSet<Integer>();
		
		SingleNode prev = null;
		SingleNode curr = head;
		
		while (curr != null) {
			if (set.contains(curr.getValue())) {
				prev.setNext(curr.getNext());
				removedNodes.add(curr);
			} else {
				set.add(curr.getValue());
			}
			
			prev = curr;
			curr = curr.getNext();
		}
	
		return removedNodes;
		
	}
	
	/**
	 * Removes duplicate nodes from an unsorted list without using a buffer
	 * 
	 * Time complexity O(n)
	 * Space complexity O(1)
	 * 
	 * @return
	 */
	
	public ArrayList<SingleNode> removeDuplicatesWithoutBuffer() {
		
		ArrayList<SingleNode> removedList = new ArrayList<SingleNode>();
		
		if ((head == null) || (head.getNext() == null)) {
			return removedList;
		}
		
		// Set initial pointers
		SingleNode currNode 	= head;
		SingleNode runnerNode	= currNode.getNext();
		SingleNode prevNode		= currNode;
		
		while ((currNode != null) && (currNode.getNext() != null)) {
			
			while (runnerNode != null) {
				
				// Remove node if duplicate found
				if (runnerNode.getValue() == currNode.getValue()) {
					prevNode.setNext(runnerNode.getNext());
					removedList.add(runnerNode);
					runnerNode = runnerNode.getNext();
				}
				
				// Move runner one step forward
				if (runnerNode != null) {
					prevNode = runnerNode;
					runnerNode = runnerNode.getNext();
				}
				
			}
			
			// Move current one step forward and reset runner
			currNode = currNode.getNext();
			if (currNode.getNext() != null) {
				runnerNode = currNode.getNext();
				prevNode = currNode;
			}
			
		}
		
		return removedList;
		
	}
	
	
	/**
	 * Reverses the linked list using an iterative implementation
	 * 
	 * Time Complexity O(n)
	 */
	
	public void reverseLinkedListIterative() {
		
		// Return if the list is empty or only has one item
		if ((head == null) || (head.getNext() == null)) {
			return;
		}
		
		SingleNode prev = null;
		
		while (head != null) {
			
			SingleNode next = head.getNext();
			head.setNext(prev);
			prev = head;
			head = next;
			
		}
		
		head = prev;
		
	}
	
	public void printList (SingleNode node) {
		
		while (node != null) {
			System.out.print(node.getValue() + " -> ");
			node = node.getNext();
		}
		
		System.out.println("\n");
		
	}
	
	public void printList() {
		SingleNode node = head;
		while (node != null) {
			System.out.print(node.getValue() + " -> ");
			node = node.getNext();
		}
		
		System.out.println("\n");
		
	}
	
}
