package com.datastructure;

public class MyStackTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Stack And Queue Data Structure Program");

		// create a nodes
		INode<Integer> myFirstNode = new MyNode<Integer>(70);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(56);

		MyStack myStack = new MyStack();

		// Push element in the stack
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		myStack.printStack();

		System.out.println("Size: " + myStack.size());
		System.out.println("IsFull: " + myStack.isFull());
		System.out.println("Peak: " + myStack.peak().getKey());

		INode peak = myStack.peak();
		if (peak == myThirdNode)
			System.out.println("Nodes are Linked");
		else
			System.out.println("Not Linked");
	}
}
