package com.linkedlist.problems;

import java.util.ArrayList;

import com.linkedlist.datastructures.SingleLinkedList;
import com.linkedlist.datastructures.SingleNode;

public class RemoveDuplicatesMain {

	/**
	 * Problem:
	 * - Remove duplicate nodes in the linked list
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Remove duplicate nodes from an unsorted linked list
		 */
		
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addToFront(3);
		linkedList.addToFront(1);
		linkedList.addToFront(4);
		linkedList.addToFront(2);
		linkedList.addToFront(3);
		linkedList.addToFront(4);
		linkedList.printList();
		
		ArrayList<SingleNode> removedNodes = linkedList.removeDuplicates();
		System.out.print("Removed nodes - ");
		for (SingleNode node : removedNodes) {
			System.out.print(node.getValue() + ", ");
		}
		System.out.print("\n");
		linkedList.printList();
		
		
	}
	
}
