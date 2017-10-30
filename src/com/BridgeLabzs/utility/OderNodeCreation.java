package com.BridgeLabzs.utility;

public class OderNodeCreation {
	int data;
	OderNodeCreation next;
	//Assigning the data value
	public void setData(int value){
		data = value;
	}
	//getting data value
	public int getData(){
		return data;
	}
	//Assigning next node
	public void setNext(OderNodeCreation node){
		next = node;
	}
	//getting next node
	public OderNodeCreation getNext(){
		return next;
	}
}
