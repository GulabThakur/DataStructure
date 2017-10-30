package com.BridgeLabzs.utility;
public class UnoderNodeCreation <T>{
	T data;
	UnoderNodeCreation next;
	//Assigning the data value
	public void setData(T value){
		data = value;
	}
	//getting data value
	public T getData(){
		return data;
	}
	//Assigning next node
	public void setNext(UnoderNodeCreation node){
		next = node;
	}
	//getting next node
	public UnoderNodeCreation getNext(){
		return next;
	}

}
