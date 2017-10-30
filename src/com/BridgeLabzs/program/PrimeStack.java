package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.StackImp;

public class PrimeStack {
			public static void main(String[] args) {
				System.out.println("Program Started");
				StackImp<Integer> stack=new StackImp<Integer>();
				FileUtility file =new FileUtility();
				boolean status,status1,status2;
				System.out.println("Anagram Number add in statck...");
				for(int i=2;i<1000;i++) 
				{
					status=file.primeNum(i);
					if(status)
					{
						for(int j=13;j<1000;j++) 
						{
							status1=file.primeNum(j);
							if(status && status1) {
							   status2=file.anagramNum(i, j);
							   if(status2) 
							   {
								   stack.push(i);
							  
							   }
							   
							}
						}
					}
					
				}
				//stack.disp();
				System.out.println("Program Ended");
			}
}
