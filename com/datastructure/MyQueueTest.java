package com.datastructure;

/*
 * Ability to dequeue from the beginning
 */
public class MyQueueTest {

	public static void main(String[] args) {

		// create a nodes
		INode myFirstNode = new MyNode<Integer>(56);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(70);

		MyQueue myQueue = new MyQueue();

		// enqueue new element in the queue
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);

		myQueue.printQueue();

		System.out.println("Size: " + myQueue.size());
		System.out.println("Peak: " + myQueue.peak().getKey());
		System.out.println("IsFull: " + myQueue.isFull());
		System.out.println("IsEmpty: " + myQueue.isEmpty());

		// dequeue new element in the stack (From the top)
		System.out.println("Dequeue-1 " + myQueue.dequeue().getKey());
		System.out.println("Dequeue-2  " + myQueue.dequeue().getKey());
		System.out.println("Dequeue-3  " + myQueue.dequeue().getKey());

		System.out.println("Size: " + myQueue.size());
		System.out.println("IsFull: " + myQueue.isFull());
		System.out.println("IsEmpty: " + myQueue.isEmpty());

		INode peak = myQueue.peak();
		if (peak == myFirstNode)
			System.out.println("Nodes are Linked");
		else
			System.out.println("Not Linked");
	}

}
