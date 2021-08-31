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
	public void search(INode node) {
		INode tempNode = this.head;
		int flag=0;
		while(!(tempNode == null)) {
			if(tempNode.getKey() == node.getKey())
			{
				System.out.println(node.getKey()+" Found");
				flag=1;
				break;
			}
			tempNode = tempNode.getNext();
			}
		if(flag==0)
			System.out.println(node.getKey()+" Not Found");
	}
	
	public void insertAfter(INode nodeAfter,INode node) {
		INode tempNode = this.head;
		while(!tempNode.equals(nodeAfter)) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(node);
		node.setNext(this.tail);
		
	}
}
