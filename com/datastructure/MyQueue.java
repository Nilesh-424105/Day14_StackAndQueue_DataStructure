package com.datastructure;

/*
 * Custom Stack Program Implementation with operation
 */
public class MyQueue {

	// Declare Variables
	private MyLinkedList myLinkedList = null;
	private int size = 3;

	// Default Constructor
	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}

	// Parameterize constructor
	public MyQueue(int size) {
		myLinkedList = new MyLinkedList<>();
		this.size = size;
	}

	/*
	 * Enqueue means Add new Element In the Queue By Calling add method in Linked
	 * List
	 */
	public void enqueu(INode node) {
		if (isFull()) {
			System.out.println("Queue OverFlow");
			return;
		}
		myLinkedList.append(node);
	}

	/*
	 * removes the first element from the queue
	 */
	public INode dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return null;
		}
		return myLinkedList.pop();
	}

	/*
	 * To Check Top Element In Queue
	 */
	public INode peak() {
		return myLinkedList.head;
	}

	/*
	 * Print the Elements in the Queue
	 */
	public void printQueue() {
		myLinkedList.printNodes();
	}

	public boolean isEmpty() {
		return myLinkedList.size() == 0;
	}

	public boolean isFull() {
		return myLinkedList.size() == size;
	}

	public int size() {
		return myLinkedList.size();
	}

}
