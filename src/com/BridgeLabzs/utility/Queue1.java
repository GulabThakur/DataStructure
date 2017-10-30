package com.BridgeLabzs.utility;

public class Queue1<T> {
	int count=0;
	Node front=null, temp;
	
	public Queue1()
	{
		
	}
	public Queue1(int num)
	{
		int[] array=new int[num];
		for(int i=0; i<num; i++)
		{
			enqueue(i);
		}
	}
	public class Node<T>
	{
		T data;
		Node next;
		
		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public <T> void enqueue(T element)
	{
		Node new_Node=new Node<T>(element);
		if(front==null)
		{
			front=new_Node;
			temp=new_Node;
			count++;
		}
		else
		{
			temp.next=new_Node;
			temp=temp.next;
			count++;
		}
	}
	
	public void deueue()
	{
		if(front==null)
		{
			System.out.println("List is Empty.");
		}
		else if(front!=null)
		{
			front=front.next;
			count--;
		}
	}
	
	public boolean isEmpty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	
	
	public int size()
	{
		return count;
	}
	
	public void getelement()
	{
		temp=front;
		for(int i=0; i<size(); i++)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
}
}
