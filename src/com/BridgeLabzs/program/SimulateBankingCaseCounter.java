package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Queue;
public class SimulateBankingCaseCounter {
	public static double balance;
	public static void main(String[] args) {
	System.out.println("Program Started");
	FileUtility file=new FileUtility();
	Queue<String> queue=new Queue<String>();
	int count=0;
	System.out.println("Welcome To cash Counter Enter True");
	int choice;
	double value;
	int number =file.inputInteger();
	String name;
	while(number>0) {
		System.out.println("Please enter the name");
		name=file.inputString();
		queue.enQueue(name);
		System.out.println("Please Enter to \n 1 :Deposite \n 2: Withdraw \n3 :extit");
		choice=file.inputInteger();
		if(choice==1) 
		{
			System.out.println("Please Enter the Amount :");
			value=file.inputDouble();
			SimulateBankingCaseCounter.deposite(value);
			count++;
			number--;
			System.out.println("Amount is "+value);
			SimulateBankingCaseCounter.chechBalnce();
		}
		if(choice==2) 
		{
			System.out.println("Please Enter the Amount :");
			value=file.inputDouble();
			System.out.println("Amount is "+value);
			SimulateBankingCaseCounter.withdraw(value);
			count++;
			number--;
		}
	  
	}
	SimulateBankingCaseCounter.chechBalnce();
	System.out.println("Total number of list is "+count);
	System.out.println("Close Cash counter ");
	System.out.println("Program Ended");
}
	public static void chechBalnce() 
	{
		System.out.println("Balance is :"+balance);
	} 
   public static void deposite(double value) 
   { 
	  balance=balance+value;
	  System.out.println("Deposite Sucessfully");
   }
   public static void withdraw(double value) 
   {
	   if(balance>value) 
	   {
		   balance=balance-value;
	   }
	   else 
	   {
		   System.out.println("Balance is note available ");
	   }
   } 
}
