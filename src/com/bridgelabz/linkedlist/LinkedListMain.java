package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args)
	{
		System.out.println("Demonstration of  Search in linked list");
		MyNode<Integer> node1 = new MyNode<Integer>(70);
		MyNode<Integer> node2 = new MyNode<Integer>(56);
		MyNode<Integer> node3 = new MyNode<Integer>(30);
		LinkedList myLinkedListNode = new LinkedList();
		myLinkedListNode.ascendingEntry(node1);
		myLinkedListNode.ascendingEntry(node2);
		myLinkedListNode.ascendingEntry(node3);
		
		myLinkedListNode.printLinkedList();
		
		
	}

}
