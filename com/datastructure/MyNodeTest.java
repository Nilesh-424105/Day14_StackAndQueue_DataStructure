package com.datastructure;

/*
 * Ability to delete 40 from the Linked List 
 * sequence of 56->30->40->70 and show the size of LinkedList is 3
 */
public class MyNodeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Linked List Computation Program");

		// create a nodes
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyNode<Integer> myNewNode = new MyNode<Integer>(40);

		MyLinkedList myLinkedList = new MyLinkedList();

		// add the new element to the head (at the start)
		// append the new element to the tail (at the end)
		// insert the new node
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printNodes();

		// Insert new element node 40 after node 30
		System.out.println("LinkedList After adding 40 after 30");
		INode searchForNode = myLinkedList.search(30);
		myLinkedList.insert(searchForNode, myNewNode);
		myLinkedList.printNodes();

		// Delete new element node 40
		System.out.println("LinkedList after deleting 40");
		myLinkedList.deleteNode(40);
		myLinkedList.printNodes();
		// Showing Size Of Linked List is 3
		System.out.println("Size of LinkedList :" + myLinkedList.size());
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}

}
