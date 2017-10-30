package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Queue;

public class PrimeNumberUsingQueue {
			public static void main(String[] args) {
				System.out.println("Program Started ");
				Queue<Integer> queue=new Queue<Integer>();
				FileUtility file =new FileUtility();
				boolean status,status1,status2;
				
				System.out.println("Anagram Number add in Queue...");
				for(int i=0;i<1000;i++) 
				{
					for(int j=1000;j>0;j--) 
					{
						status=file.primeNum(i);
						//System.out.println(status);
						status1=file.primeNum(j);
						if(status && status1) {
						   status2=file.anagramNum(i, j);
						   if(status2) 
						   {
							   queue.enQueue(i);
							  // queue.enQueue(j);
							   System.out.println();
							    
						   }
						}
					}
				}
				queue.display();
				System.out.println("Program Ended");
			}
}
