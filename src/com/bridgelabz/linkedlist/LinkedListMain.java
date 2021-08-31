package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args)
	{
		System.out.println("Welcome to linked list in data structure");
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		myLinkedList.printLinkedList();
		
		System.out.println("appending node to linked list");
		MyNode<Integer> node1 = new MyNode<Integer>(70);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(56);
		LinkedList myLinkedListNode1 = new LinkedList();
		myLinkedListNode1.appendNodes(firstNode);
		myLinkedListNode1.appendNodes(secondNode);
		myLinkedListNode1.appendNodes(thirdNode);
		myLinkedListNode1.printLinkedList();
	}

}
