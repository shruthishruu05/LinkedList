package com.bridgelabz.linkedlist;

public class LinkedList {
	
	public INode head;
	public INode tail;
	
	public LinkedList() {
		this.head = head;
		this.tail = tail;
	}
	public void add(INode newNode)
	{
		if(this.tail==null) {
			this.tail = newNode;
		}
		if(this.head==null) {
			this.head = newNode;
		}
		else
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	public void appendNodes(INode newNode)
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
			INode tempNode =newNode;
			tempNode.setNext(this.head);
			this.head = newNode;
		}
	}
	
	public void printLinkedList()
	{
		System.out.println("My nodes: "+head );
	}
	public void insert(INode newNode)
	{
		this.head.setNext(newNode);
		newNode.setNext(this.tail);
		
	}
	public Object pop()
	{
		INode tempNode = this.head;
		this.head = (INode) this.head.getNext();
		return  tempNode.getKey();	
	}
	public Object popLast()
	{
		INode temporaryNode = this.head;
		while(!temporaryNode.getNext().equals(this.tail))
		{
			temporaryNode = temporaryNode.getNext();
		}
		this.tail = temporaryNode;
		temporaryNode = temporaryNode.getNext();
		this.tail.setNext(null);
		return temporaryNode;
	}
}
