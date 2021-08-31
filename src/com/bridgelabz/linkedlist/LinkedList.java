package com.bridgelabz.linkedlist;

public class LinkedList {
	
	public MyNode head;
	public MyNode tail;
	
	public LinkedList() {
		this.head = head;
		this.tail = tail;
	}
	public void add(MyNode newNode)
	{
		if(this.tail==null) {
			this.tail = newNode;
		}
		if(this.head==null) {
			this.head = newNode;
		}
		else
		{
			MyNode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	public void appendNodes(MyNode newNode)
	{
		if(this.head==null)
		{
			this.head =newNode;
		}
		if(this.tail==null) {    
			this.tail = newNode;
		}
		else
		{
			MyNode tempNode =newNode;
			tempNode.setNext(this.head);
			this.head = newNode;
		}
	}
	
	public void printLinkedList()
	{
		System.out.println("My nodes: "+head );
	}
	public void insert(MyNode newNode)
	{
		this.head.setNext(newNode);
		newNode.setNext(this.tail);
		
	}
	public Object pop()
	{
		
		MyNode tempNode = this.head;
		this.head = (MyNode) this.head.getNext();
		return  tempNode.getKey();	
	}
}
