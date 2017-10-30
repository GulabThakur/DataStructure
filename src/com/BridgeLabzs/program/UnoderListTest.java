package com.BridgeLabzs.program;

import java.io.File;
import java.util.LinkedList;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.UnoderNode;

public class UnoderListTest {
	public static void main(String[] args) {
		System.out.println("Program Started");
		FileUtility fu = new FileUtility();
		UnoderNode node = new UnoderNode();
		String search;
		File file = new File("/home/brideit/content.text");
		String string = fu.readFile(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		for(int i=0;i<str.length;i++) 
		{
			node.addNode(str[i]);
		}
		System.out.println("Please Enter you want to search :");
		search=fu.inputString();
		node.search(search);
		System.out.println("Program Ended ");
	}

}
