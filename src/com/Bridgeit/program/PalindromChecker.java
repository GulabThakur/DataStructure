package com.Bridgeit.program;

import java.util.Deque;
import java.util.Scanner;

import com.BridgeLabzs.utility.Dequeue;
import com.BridgeLabzs.utility.FileUtility;

public class PalindromChecker  {
	static Dequeue que=new Dequeue();
	public static void main(String[] args) {
		FileUtility file=new FileUtility();
	 System.out.println("Program Started ");
	 System.out.println("Please Enter the String ");
	 String string=file.inputString();
	 boolean status= file.check(string);
	 if(status) 
	 {
		 System.out.println("This String is Palindrom");
	 }
	 else 
	 {
		 System.out.println("This String is not Palindrom");
	 }
	 System.out.println("Program Ended ");
	}	
	
}
