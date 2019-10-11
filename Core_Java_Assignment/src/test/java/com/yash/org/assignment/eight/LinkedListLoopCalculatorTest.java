package com.yash.org.assignment.eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.org.assignment.eight.LinkedListLoopCalculator;
import com.yash.org.assignment.eight.MyLinkedList;
import com.yash.org.assignment.eight.MyLinkedList.Node;

public class LinkedListLoopCalculatorTest {
	
	@Test
	public void shouldReturnCountOfLoopInLinkedListGivenLinkedListhasLoop(){
		LinkedListLoopCalculator linkCalculator=new LinkedListLoopCalculator();
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.head = myLinkedList.new Node(1);
		myLinkedList.head.next = myLinkedList.new Node(2);
		Node node = myLinkedList.head.next.next = myLinkedList.new Node(3);
		myLinkedList.head.next.next.next = myLinkedList.new Node(4);
		myLinkedList.head.next.next.next.next = myLinkedList.new Node(5);
		myLinkedList.head.next.next.next.next.next = node;
		Integer expectedCount=3;
		Integer actualCount=linkCalculator.lengthOfLoop(myLinkedList);
		assertEquals(expectedCount,actualCount);
	}
	
	@Test
	public void shouldReturnZeroGivenLinkedListhasNoLoop(){
		LinkedListLoopCalculator linkCalculator=new LinkedListLoopCalculator();
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.head = myLinkedList.new Node(1);
		myLinkedList.head.next = myLinkedList.new Node(2);
		myLinkedList.head.next.next = myLinkedList.new Node(3);
		myLinkedList.head.next.next.next = myLinkedList.new Node(4);
		myLinkedList.head.next.next.next.next = myLinkedList.new Node(5);
		Integer expectedCount=0;
		Integer actualCount=linkCalculator.lengthOfLoop(myLinkedList);
		assertEquals(expectedCount,actualCount);	
	}
	
	@Test
	public void shouldReturnZeroGivenLinkedListhasFastNextIsNull(){
		LinkedListLoopCalculator linkCalculator=new LinkedListLoopCalculator();
		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.head = myLinkedList.new Node(1);
		myLinkedList.head.next = myLinkedList.new Node(2);
		
		Integer expectedCount=0;
		Integer actualCount=linkCalculator.lengthOfLoop(myLinkedList);
		assertEquals(expectedCount,actualCount);	
	}
	
	
	@Test
	public void shouldReturnZeroGivenLinkedListIsNull(){
		LinkedListLoopCalculator linkCalculator=new LinkedListLoopCalculator();
		MyLinkedList myLinkedList = new MyLinkedList();
		//myLinkedList=null;
		Integer expectedCount=0;
		Integer actualCount=linkCalculator.lengthOfLoop(myLinkedList);
		assertEquals(expectedCount,actualCount);	
	}

}
