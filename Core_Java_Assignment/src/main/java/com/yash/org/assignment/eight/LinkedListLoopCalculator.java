package com.yash.org.assignment.eight;

import com.yash.org.assignment.eight.MyLinkedList.Node;

public class LinkedListLoopCalculator {
	
	public Integer lengthOfLoop(MyLinkedList myLinkedList) {
		Node head = myLinkedList.head;
		Node slow = head;
		Node fast = head;

		boolean loop = false;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				loop = true;
				break;
			}
		}

		if (loop) {

			int length = 0;
			slow = head;

			while (fast != slow) {
				fast = fast.next;
				slow = slow.next;
			}

			do {
				fast = fast.next;
				length++;
			} while (fast != slow);

			return length;

		}

		return 0;
	}


}
