package com.BridgeLabzs.utility;

import java.io.File;

public class UnoderNode<T> {
	UnoderNodeCreation head,tail,node,temp,temp2;
	FileUtility fu = new FileUtility();
	File file = new File("/home/brideit/content.text");
	/*
	* This method is used to add data to the linked list
	* @Param data,first parameter for this method.
	**/	
	public void addNode(T value){
		node = new UnoderNodeCreation();
		node.setData(value);
		if(head == null){
			head = node;
			tail = node;
		}
		else{
			tail.setNext(node);
			tail = node;
		}	
	}//end of add method
        /*
	* This method is used to update the given file.
	**/
	public void fileUpdate(){
		temp = head;
		fu.clearFile(file);
		int total = 0;
		if(temp == null)
			System.out.println("List is Empty");
		else{
			while(temp != null){
				total++;
				String str = (String)temp.getData();
			//	System.out.println(str);
				fu.writeFile(file, str);
				temp = temp.getNext();
				
			}
		}
	}//end of fileUpdate
        /*
	* This method is used search the value in the linked list
	* @Param data,first parameter for this method.
	**/
	public void search(T value){
		int count = 0;
		temp = head;
		while(temp != null){
			if(value.equals(temp.getData())){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.fileUpdate();
				this.show();
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
			this.show();
			//System.out.println(fu.readFile(file));
			System.out.println();
		}
	}//end of search

	/*
	* This method is used to remove data to the linked list
	* @Param data,first parameter for this method.
	**/
	public void remove(T value){
		if(head==null)
		{
			System.out.println("Please Add fist then remove ");
		}
		else
		{
			temp = head;
			temp2 = temp.getNext();
			node = new UnoderNodeCreation();
			node.setData(value);
			if(value.equals(head.getData()))
				head = head.getNext();
			else{
				while(temp2 != null){
					if(value.equals(temp2.getData())){
						temp.setNext(temp2.getNext());
						break;			
					}
					else{
						temp = temp2;
						temp2 = temp2.getNext();
					}
				}
			}

		}	
		}//end of remove method
	public void show()
	{   UnoderNodeCreation temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.getNext();
		}
	}
}
