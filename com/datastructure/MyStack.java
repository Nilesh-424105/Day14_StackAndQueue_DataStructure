package com.datastructure;

public class MyStack {

	// Declare Variables
	private MyLinkedList myLinkedList;
	private int size = 3;

	// Default Constructor
	public MyStack() {
		myLinkedList = new MyLinkedList<>();
	}

	// Parameterize constructor
	public MyStack(int size) {
		myLinkedList = new MyLinkedList<>();
		this.size = size;
	}

	/*
	 * Push Element In the Stack By Calling add method in Linked List
	 */
	public void push(INode node) {
		if (isFull()) {
			System.out.println("Stack OverFlow");
			return;
		}
		myLinkedList.add(node);
	}

	/*
	 * To Check Top Element In Stack
	 */
	public INode peak() {
		return myLinkedList.head;
	}

	/*
	 * Print the Elements in the Satcks
	 */
	public void printStack() {
		myLinkedList.printNodes();
	}

	public boolean isFull() {
		return myLinkedList.size() == size;
	}

	public int size() {
		return myLinkedList.size();
	}

}