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

		System.out.println("Pre Order Traversal");
		traversePreOrder(root);
		System.out.println("\n");
		
		System.out.println("In Order Traversal");
		traverseInOrder(root);
		System.out.println("\n");
		
		System.out.println("Breadth First Search");
		bfs(root);
		System.out.println("\n");
		
		System.out.println("Breadth First Search - Line by Line");
		bfsLineByLine(root);
		System.out.println("\n");
		
		System.out.println("Depth First Search - Iterative (pre-order)");
		dfsIterativePreOrder(root);
		System.out.println("\n");
		
		System.out.println("Depth First Search - Iterative (in-order)");
		dfsIterativeInOrder(root);
		System.out.println("\n");
		
		System.out.println("Depth First Search - Recursive (pre-order)");
		dfsRecursivePreOrder(root);
		System.out.println("\n");
		
		System.out.println("Max Width");
		System.out.println(maxWidth(root));
		System.out.println("\n");
		
		System.out.println("Max Height");
		System.out.println(maxHeight(root));
		System.out.println("\n");
		
		System.out.println("Contains the value 20");
		System.out.println(contains(root, 20).getValue());
		System.out.println("\n");
		
		System.out.println("Is Valid");
		System.out.println(isValid(root, null, null));
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
	
	public static void dfsIterativePreOrder(Node root) {
		
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
	
	public static void dfsIterativeInOrder(Node root) {
		
		Stack<Node> stack = new Stack<Node>();
		
		while (true) {
			
			// Go to the left extreme insert all the elements to stack
			while (root != null) {
				stack.push(root);
				root = root.getLeftChild();
			}
			
			// Check if Stack is empty, if yes, exit from everywhere
			if (stack.isEmpty()) {
				return;
			}
			
			// Pop the element from the stack , print it and add the nodes at
			// the right to the Stack
			root = stack.pop();
			System.out.print(root.getValue() + " -> ");
			root = root.getRightChild();
		
		}
		
	}
	
	public static void dfsRecursivePreOrder(Node root) {
		
		if (root == null) {
			return;
		}
		
		System.out.print(root.getValue() + " -> ");
		
		if (root.getLeftChild() != null) {
			dfsRecursivePreOrder(root.getLeftChild());
		}
		
		if (root.getRightChild() != null) {
			dfsRecursivePreOrder(root.getRightChild());
		}
		
	}
	
	/**
	 * Find the maximum width of a tree which is basically a bfs where maxWidth = maxQueueSize()
	 * @param root
	 * @return
	 */
	
	public static int maxWidth(Node root) {
		
		if (root == null) {
			return 0;
		}
		
		int maxWidth = 0;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
		
//			System.out.println("NODE: " + queue.peek().getValue() + " SIZE: " + queue.size());
			
			if (queue.size() > maxWidth) {
				maxWidth = queue.size();
			}
			
			Node node = queue.remove();
			
			if (node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			
			if (node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
			
		}
		
		return maxWidth;
		
	}
	
	/**
	 * Find the maximum height of a tree
	 * - HEIGHT is the number of edges in longest path from node to leaf node.
	 * - DEPTH is the number of edges from node to root node.
	 * @param root
	 * @return
	 */
	
	public static int maxHeight(Node root) {
		
		if (root == null) {
			return -1;
		}
		
		int leftHeight = maxHeight(root.getLeftChild());
		int rightHeight = maxHeight(root.getRightChild());
		
		return Math.max(leftHeight, rightHeight) + 1;
		
	}

	public static void bfsLineByLine(Node root) {
		
		if (root == null) {
			return;
		}
		
		int count = 0;
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		queue.add(null);
		
		while (!queue.isEmpty()) {
			
			Node node = queue.remove();
			
			if (node != null) {
			
				count++;
				
				System.out.print(node.getValue() + " -> ");
				
				if (node.getLeftChild() != null) {
					queue.add(node.getLeftChild());
				}
				
				if (node.getRightChild() != null) {
					queue.add(node.getRightChild());
				}
				
			} else {
				
				System.out.print("(" + count + ")" + "\n");
				count = 0;
				if (!queue.isEmpty()) {
					queue.add(null);
				}
				
			}
			
		}
		
	}
	
	public static void traversePreOrder(Node root) {
		
		System.out.print(root.getValue() + " -> ");
		
		if (root.getLeftChild() != null) {
			traversePreOrder(root.getLeftChild());
		}
		
		if (root.getRightChild() != null) {
			traversePreOrder(root.getRightChild());
		}
	
	}
	
	public static void traverseInOrder(Node root) {
		
		if (root.getLeftChild() != null) {
			traverseInOrder(root.getLeftChild());
		}
		
		System.out.print(root.getValue() + " -> ");
		
		if (root.getRightChild() != null) {
			traverseInOrder(root.getRightChild());
		}
	
	}
	
	public static Node contains(Node root, int data) {
		
		if (data == root.getValue()) {
			return root;
		}
		
		if (root.getLeftChild() != null) {
			return contains(root.getLeftChild(), data);
		}
		
		if (root.getRightChild() != null) {
			return contains(root.getRightChild(), data);
		}
		
		return null;
		
	}
	
	public static boolean isValid(Node root, Integer minValue, Integer maxValue) {
			
		// Compare maxValue with current node
		if ((maxValue != null) && (root.getValue() > maxValue)) {
			return false;
		}
		
		// Compare minValue with current node
		if ((minValue != null) && (root.getValue() < minValue)) {
			return false;
		}
		
		// Check all the left children
		if (root.getLeftChild() != null) {
			boolean leftChildValid = isValid(root.getLeftChild(), minValue, root.getValue());
			if (!leftChildValid) {
				return false;
			}
		}
		
		// Check all the right children
		if (root.getRightChild() != null) {
			boolean rightChildValid = isValid(root.getRightChild(), root.getValue(), maxValue);
			if (!rightChildValid) {
				return false;
			}
		}
		
		// Return true if all the checks pass
		return true;
		
	}
	
}
