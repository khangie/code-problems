package com.tree.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.tree.datastructures.Node;

public class TreeTraversal {

	public static void main(String[] args) {

		/*
		 *                        25
		 *                     /     \
		 *                    20      27
		 *                   /  \    /  \
		 *                  15   22 26  30
		 *                    \        /  \
		 *                     17     29  32
		 */
		
		Node root = new Node(25);
		root.insert(20);
		root.insert(15);
		root.insert(27);
		root.insert(30);
		root.insert(29);
		root.insert(26);
		root.insert(22);
		root.insert(32);
		root.insert(17);

		System.out.println("In Order Traversal");
		root.traverseInOrder();
		System.out.println("\n");
		
		System.out.println("Breadth First Search");
		bfs(root);
		System.out.println("\n");
		
		System.out.println("Depth First Search - Iterative");
		dfsIterative(root);
		System.out.println("\n");
		
		System.out.println("Depth First Search - Recursive");
		dfsRecursive(root);
		System.out.println("\n");
		
	}

	public static void bfs(Node root) {
		
		if (root == null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node node = queue.remove();
			System.out.print(node.getValue() + " -> ");
			
			if (node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			
			if (node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
			
		}
		
	}
	
	public static void dfsIterative(Node root) {
		
		if (root == null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			
			Node node = stack.pop();
			System.out.print(node.getValue() + " -> ");
			
			if (node.getRightChild() != null) {
				stack.push(node.getRightChild());
			}
			
			if (node.getLeftChild() != null) {
				stack.push(node.getLeftChild());
			}
		
		}
		
	}
	
	public static void dfsRecursive(Node root) {
		
		if (root == null) {
			return;
		}
		
		System.out.print(root.getValue() + " -> ");
		
		if (root.getLeftChild() != null) {
			dfsRecursive(root.getLeftChild());
		}
		
		if (root.getRightChild() != null) {
			dfsRecursive(root.getRightChild());
		}
		
	}
	
}
