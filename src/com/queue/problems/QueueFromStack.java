package com.queue.problems;

import java.util.Stack;

/**
 * Implement a queue from two stacks
 * @author knguyen
 *
 */

public class QueueFromStack {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	}

	public static class MyQueue {
		
		Stack<Integer> stackNewest;
		Stack<Integer> stackOldest;
		
		public MyQueue() {
			stackNewest = new Stack<Integer>();
			stackOldest = new Stack<Integer>();
		}
		
		public int size() {
			return stackNewest.size() + stackOldest.size();
		}
		
		public void add(int value) {
			// Push onto stackNewest which always has the newest elements on the top
			stackNewest.push(value);
		}
		
		private void shiftStacks() {
			while (!stackNewest.isEmpty()) {
				int val = stackNewest.pop();
				stackOldest.push(val);
			}
		}
		
		public int peek() {
			
			if (stackOldest.isEmpty()) {
				shiftStacks();
			}
			
			return stackOldest.peek();
		}
		
		public int remove() {
			
			if (stackOldest.isEmpty()) {
				shiftStacks();
			}
			
			return stackOldest.pop();
			
		}
		
	}
	
}
