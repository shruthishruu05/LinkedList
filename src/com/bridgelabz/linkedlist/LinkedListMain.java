package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args)
	{
		System.out.println("Demonstration of  Search in linked list");
		MyNode<Integer> node1 = new MyNode<Integer>(70);
		MyNode<Integer> node2 = new MyNode<Integer>(56);
		MyNode<Integer> node3 = new MyNode<Integer>(30);
		LinkedList myLinkedListNode = new LinkedList();
		myLinkedListNode.add(node1);
		myLinkedListNode.add(node2);
		myLinkedListNode.insert(node3);
		MyNode<Integer> node4 = new MyNode<Integer>(40);
		myLinkedListNode.insertAfter(node3,node4);
		myLinkedListNode.printLinkedList();
		
		
	}

}
