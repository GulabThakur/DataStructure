package com.BridgeLabzs.utility;

import java.io.File;
import java.io.FileWriter;

public class OderNode<T>{
	OderNodeCreation head=null,tail,temp,temp2,node;
	FileUtility fu=new FileUtility();
	File file=new File("/home/brideit/Oder.txt");
	/*
	* This method is used to add the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void addNode(int value){
		node = new OderNodeCreation();
		node.setData(value);
		
		if(head == null){
			head = node;
			temp = node;
			tail = node;
		}
		
		else{
			
			if(value < head.getData()){
				node.setNext(head);
				head = node;
				temp = head;
			}
			if(value > tail.getData()){
				tail.setNext(node);
				tail = node;
			}
			
			if(value > head.getData() && value < tail.getData()){
				boolean condition = true;
				temp = head;
				while(condition){
					if(value > temp.getData() && value <= temp.getNext().getData()){
						node.setNext(temp.getNext());
						temp.setNext(node);
						condition = false;
					}
					else	
						temp = temp.getNext();
				}
			}
		}
		
	}//end of addNode method
	/**
	 * for update file
	 */
	public void fileUpdate(){
		temp = head;
		fu.clearFile(file);
		System.out.println(fu.readFile(file));
		int total = 0;
		if(temp == null)
			System.out.println("List is Empty");
		else{
			while(temp != null){
				total++;
				 String str = String.valueOf(temp.getData());
				 fu.writeFile(file, str);
				 temp = temp.getNext();
				
			}
		}
	}
	/*
	* This method is used to display all the linked list elements
	**/
	public void showList(){
		temp = head;
		int total = 0;
		if(temp == null)
			System.out.println("List is Empty");
		else{
			while(temp != null){
				total++;
				System.out.print(temp.getData()+" ");
				temp = temp.getNext();
			}
			System.out.println("\nTotal numbers in list: "+total);
		}
	}//end of showList method
		
	/*
	* This method is used to search the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void search(int value){
		int count = 0;
		temp = head;
		while(temp != null){
			if(value == temp.getData()){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.fileUpdate();
				this.showList();
				System.out.println();
				
			}
			else
				temp = temp.getNext();
		}
		if(count == 0){
			System.out.println("Search not found, Element is added");
			this.addNode(value);
			System.out.print("New list is: ");
			this.fileUpdate();
			this.showList();
			System.out.println();
		}
		
	}//end of search method

	/*
	* This method is used to remove the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void remove(int value){
		temp = head;
		temp2 = temp.getNext();
		node = new OderNodeCreation();
		node.setData(value);
		if(value == head.getData())
			head = head.getNext();
		else{
			while(temp2 != null){
				if(node.getData() == temp2.getData()){
					temp.setNext(temp2.getNext());
					break;			
				}
				else{
					temp = temp2;
					temp2 = temp2.getNext();
				}
			}
		}
	}//end of remove method

}
