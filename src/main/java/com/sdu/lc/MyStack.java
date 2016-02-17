package com.sdu.lc;

import java.util.*;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
class MyStack {
	// Push element x onto stack.

	Queue q1 = new ArrayDeque<Integer>();
	Queue q2 = new ArrayDeque<Integer>();


	public void push(int x) {
		if (q1.isEmpty()) {
			if (q2.isEmpty()) {
				q1.add(x);
			} else {
				q2.add(x);
			}
		} else {
			q1.add(x);
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (!q1.isEmpty()) {
			int l = q1.size();
			for (int i = 0; i < l-1; i++) {
				q2.add(q1.poll());
			}
			q1.poll();
		} else if (!q2.isEmpty()) {
			int l = q2.size();
			for (int i = 0; i < l-1; i++) {
				q1.add(q2.poll());
			}
			q2.poll();
		}
	}

	// Get the top element.
	public int top() {
		int result = -1;
		if (!q1.isEmpty()) {
			int l = q1.size();
			for (int i = 0; i < l-1; i++) {
				q2.add(q1.poll());
			}
			result = (Integer) q1.poll();
			q2.add(result);

		} else if (!q2.isEmpty()) {
			int l = q2.size();
			for (int i = 0; i < l-1; i++) {
				q1.add(q2.poll());
			}
			result = (Integer) q2.poll();
			q1.add(result);
		}

		return result;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return (q1.isEmpty() && q2.isEmpty());
	}
}
