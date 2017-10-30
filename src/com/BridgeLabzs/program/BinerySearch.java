package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;

public class BinerySearch {
		public static void main(String[] args) {
			System.out.println("Program Started");
			FileUtility fileUtility=new FileUtility();
			System.out.println("Please Enter the how many you to search node");
			int node =fileUtility.inputInteger();
			int value;
			for(int i=1;i<=node;i++)
			{   
				System.out.println("Please Enter the number :");
				value=fileUtility.inputInteger();
				value=(int) fileUtility.bineryNode(value);
				System.out.println("Total node is :"+value);
				
			}
			System.out.println("Program Ended");
		}
}
