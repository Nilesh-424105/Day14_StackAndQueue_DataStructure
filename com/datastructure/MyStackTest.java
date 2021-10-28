package com.datastructure;

/*
 * Ability to peak and pop from the Stack till it is empty
 */
public class MyStackTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Stack And Queue Data Structure Program");

		// create a nodes
		INode<Integer> myFirstNode = new MyNode<Integer>(70);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(56);

		MyStack myStack = new MyStack();

		// Push new element in the stack(From The Top)
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		myStack.printStack();

		System.out.println("Size: " + myStack.size());
		System.out.println("Peak: " + myStack.peak().getKey());
		System.out.println("IsFull: " + myStack.isFull());
		System.out.println("IsEmpty: " + myStack.isEmpty());

		// pop new element in the stack (From the top)
		System.out.println("Pop-1 " + myStack.pop().getKey());
		System.out.println("Pop-2 " + myStack.pop().getKey());
		System.out.println("Pop-3 " + myStack.pop().getKey());

		System.out.println("Size: " + myStack.size());
		System.out.println("IsFull: " + myStack.isFull());
		System.out.println("IsEmpty: " + myStack.isEmpty());

		INode peak = myStack.peak();
		if (peak == myThirdNode)
			System.out.println("Nodes are Linked");
		else
			System.out.println("Not Linked");
	}
}
