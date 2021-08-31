package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args)
	{
		
		
		System.out.println("Demonstration of  nodes insertion to linked list");
		MyNode<Integer> node1 = new MyNode<Integer>(70);
		MyNode<Integer> node2 = new MyNode<Integer>(56);
		MyNode<Integer> node3 = new MyNode<Integer>(30);
		LinkedList myLinkedListNode = new LinkedList();
		myLinkedListNode.appendNodes(node1);
		myLinkedListNode.appendNodes(node2);
		myLinkedListNode.insert(node3);
		Object deleteNode = myLinkedListNode.popLast();
		System.out.println("the deleted value is "+deleteNode);
		
		myLinkedListNode.printLinkedList();
		
		
	}

}
