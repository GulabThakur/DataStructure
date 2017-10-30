package com.BridgeLabzs.utility;

public class Linklist {
    Node head;
    public class Node
    {
    	int date;
    	char day1;
    	Node next;
    	public Node(int iteam,char day ) 
    	{
    		date=iteam;
    		day1=day;
    		next=null;
    	}
    }
    public void insert(int value,char arr) 
    {
    	Node node=new Node(value,arr);
    	node.next=head;
    	head=node;
    }
    public void dispaly() 
    {
    	Node temp=head;
    	while(temp!=null) 
    	{
    		System.out.println(temp.date+" "+temp.day1+" ");
    		temp=temp.next;
    	}
    }
   
}
