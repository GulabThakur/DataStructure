package com.BridgeLabzs.program;

public class UsingStack1<T> {
	 Node top;
	 public class Node<T>
	 {
		T data;
		Node next;
		
		 }
	 

public void push(T data) 
{
	Node temp = new Node();
	temp.data=data;
	temp.next=null;
	
	if(top==null) {
		top=temp;
		return;
	}
	Node temp1=top;
	while(temp1.next!=null) {
		temp1=temp1.next;
	}
	temp1.next=temp;
}

public void display() {
	 Node temp=top;
	 
	 while(temp!=null) {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
}
	 public static void main(String[] args) {
		System.out.println("Program Started ");
		UsingStack1 stack1=new UsingStack1();
		int a[]= {10,20,34,50};
		for(int i=0;i<a.length;i++)
		stack1.push(a[i]);
		stack1.display();
		System.out.println("Program Ended");
	}
}
