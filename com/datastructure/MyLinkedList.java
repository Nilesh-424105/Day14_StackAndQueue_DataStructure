package com.datastructure;

/*
 * Custom Linked List Implementation with operation
 */
public class MyLinkedList<K> {

	// Declare Variables
	public INode head;
	public INode tail;
	private int size;

	// Default Constructor
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * Add Node to Front of the List (To the head of the list) and Increments the
	 * size of the list
	 */
	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			INode temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
		size++;
	}

	/*
	 * Add the node at the end of the list (tail of the list) and increment the size
	 * of list
	 */
	public void append(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}
		size++;
	}

	/*
	 * inserts the new node next to the myNode and increment the size
	 */
	public void insert(INode myNode, INode newNode) {
		INode temp = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);

		size++;
	}

	/*
	 * removes the first element (from the head) and decrements the size
	 */
	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		size--;
		return temp;
	}

	/*
	 * removes the last element (from the tail) and decrement the size
	 */
	public INode popLast() {
		INode temp = this.head;
		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.tail = temp;
		tail.setNext(null);
		size--;
		return temp;
	}

	/*
	 * searches for a given key in list and returns the INode if it finds key
	 */
	public INode search(K key) {
		INode node = head;
		while (!node.getKey().equals(30)) {
			node = node.getNext();
		}
		return node;
	}

	/*
	 * Delete new added node and decrement the size
	 */
	public INode deleteNode(K key) {
		INode node = head;
		INode previous = null;
		while (!node.getKey().equals(key)) {
			previous = node;
			node = node.getNext();
		}
		previous.setNext(node.getNext());
		size--;
		return node;
	}

	/*
	 * returns the size of the List
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Pints the node keys in the List
	 */
	public void printNodes() {
		StringBuilder nodes = new StringBuilder("Node keys: ");
		INode temp = this.head;
		while (temp != null) {
			nodes.append(temp.getKey());
			if (temp != tail) {
				nodes.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(nodes);
	}
}
