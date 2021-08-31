package com.bridgelabz.linkedlist;

public class LinkedList {
	
	public MyNode head;
	public MyNode tail;
	
	public LinkedList() {
		this.head = head;
		this.tail = tail;
	}
	public void add(MyNode newnode)
	{
		if(this.tail==null) {
			this.tail = newnode;
		}
		if(this.head==null) {
			this.head = newnode;
		}
		else
		{
			MyNode tempNode = this.head;
			this.head = newnode;this.head.setNext(tempNode);
		}
	}
	
	public void printLinkedList()
	{
		System.out.println("My nodes: "+head );
	}
	
	
}
