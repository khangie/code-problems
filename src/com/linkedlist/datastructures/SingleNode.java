package com.linkedlist.datastructures;

public class SingleNode {

	private int value;
	private SingleNode next;
	
	public SingleNode(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SingleNode getNext() {
		return next;
	}

	public void setNext(SingleNode next) {
		this.next = next;
	}
	
}
