package com.BridgeLabzs.utility;

public class StackImp<T> {
	Linklist list=new Linklist();
	private int count=-1;
	public Node head=null, tail=null;
	private Node temp,temp2, prev;
	
	//Inner Class
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
	
	
	/**
	 * @param item
	 * 
	 * @description This method is used to push the items.
	 */
	public <T> void push(T item)
	{
		Node new_Node=new Node<T>(item);
		
		if(head==null)
		{
			head=new_Node;
			tail=new_Node;
			count++;
		}
		
		else
		{
			prev=tail;
			tail=new_Node;
			count++;
		}
	}
	
	/**
	 * @Description This method is used to remove the elements.
	 */
	public void pop()
	{
		if(head==null)
		{
			System.out.println("List is Empty. Please first insert the element.");
		}
		else
		{
			temp2=tail;
			tail=prev;
			count--;
			
		}
	}
	
	
	/**
	 * @return boolean
	 * 
	 * @Description This method is returns and check stack is Empty or not.
	 */
	public boolean isEmpty()
	{
		if(count==-1)
			return true;
		else
			return false;
	}
	
	/**
	 * @return T
	 * 
	 * @Description This method returns top element of the stack.
	 */
	public T peek()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty.");
			return null;
		}
		else{
			return (T) tail.getData();
		}
	}
	
	
	/**
	 * @return integer
	 * 
	 * @Description This method returns size of Stack.
	 */
	public int size()
	{
		return count;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * @return
	 */
	public StackImp<T> getElement()
=======
	public StackImp<String> getElement()
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
	public StackImp<String> getElement()
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	{
		StackImp<String> list=new StackImp<String>();
		if(head!=null)
		{
			temp=head;
			for(int i=0; i<size(); i++)
			{
				list.push((String)temp.getData());
				temp=temp.getNext();
			}
<<<<<<< HEAD
<<<<<<< HEAD
			return (StackImp<T>) list;
		}
		else{
			System.out.println("Stack is Empty.");
			return (StackImp<T>) list;
		}
   }
	public void dispaly()
	{
		temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			return list;
		}
		else{
			System.out.println("Stack is Empty.");
			return list;
		}
}
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
}
