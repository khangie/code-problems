package com.linkedlist.datastructures;

public class DoubleNode {

	private int value;
	private DoubleNode prev;
	private DoubleNode next;
	
	public DoubleNode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
}
