package com.BridgeLabzs.utility;

import com.BridgeLabzs.utility.UsingStack.Node;

public class Stack<T> {
	 Node head;
     public class Node<T>
     {
    	 T data;
    	 Node next;
    	 
    	 
     }
    
     public void push(T value) 
	 {
    	 Node temp = new Node();
    		temp.data=value;
    		temp.next=null;
    		
    		if(head==null) {
    			head=temp;
    			return;
    		}
    		Node temp1=head;
    		while(temp1.next!=null) {
    			temp1=temp1.next;
    		}
    		temp1.next=temp;
	 }
     public void disp() 
     {
    	
    	 Node temp=head;
    	 while(temp!=null) 
    	 {
    		 System.out.print(temp.data+" ");
    		 temp=temp.next;
    		
    	 }
     }
     
    public void disp1() {
    	 Node temp=head;
    	 
    	 while(temp!=null) {
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	 }
    	 System.out.println();
     }
}
