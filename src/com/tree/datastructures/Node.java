package com.tree.datastructures;

public class Node {

	private int value;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int value) {
		this.value = value;
	}
	
	public void insert(int data) {
		
		if (data == value) {
			return;
		}
		
		if (data < value) {
			if (leftChild == null) {
				leftChild = new Node(data);
			} else {
				leftChild.insert(data);
			}
		} else {
			if (rightChild == null) {
				rightChild = new Node(data);
			} else {
				rightChild.insert(data);
			}
		}
		
	}
	
	public Node get(int data) {
		
		if (data == value) {
			return this;
		}
		
		if (data < value) {
			if (leftChild != null) {
				return leftChild.get(data);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(data);
			}
		}
		
		return null;
		
	}
	
	public void traverseInOrder() {
		
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		
		System.out.print(value + " -> ");
		
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
	
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
}
