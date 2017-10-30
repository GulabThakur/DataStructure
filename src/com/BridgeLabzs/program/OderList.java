package com.BridgeLabzs.program;

import java.io.File;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.OderNode;

public class OderList {
	public static void main(String[] args){
		FileUtility u = new FileUtility();
		OderNode node = new OderNode();
		File file = new File("/home/brideit/Gulab Thakur/eclip/DataStructure/src/Oder.txt");
		String string= u.readFile(file); 
		System.out.println("Contents of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		Integer array[]=new Integer[strArray.length];
		
		for(int i=0;i<array.length;i++) 
		{
			
			System.out.print(strArray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			array[i]=Integer.valueOf(strArray[i]);
			
		}
		for(int i=0;i<strArray.length;i++){
			
			node.addNode(array[i]);
		}
		
		System.out.print("List Elements are: ");
		node.showList();

		System.out.print("\nPlease Enter the element you want to Search: ");
		int value = u.inputInteger();
		node.search(value); 
	}
}
