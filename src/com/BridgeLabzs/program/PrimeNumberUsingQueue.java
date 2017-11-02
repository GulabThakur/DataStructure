package com.BridgeLabzs.program;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Queue;
public class PrimeNumberUsingQueue {
			public static void main(String[] args) {
				System.out.println("Program Started ");
				System.out.println("Please Enter the Number Starting point");
				Queue<Integer> queue=new Queue<Integer>(); 
				FileUtility file=new FileUtility();
				Scanner scanner=new Scanner(System.in);
				boolean status,status2,status1;
				int number = 0,last = 0;
				try {
					number=scanner.nextInt();
					System.out.println("Please Enter the Last Number");
					 last=scanner.nextInt();
				} catch (Exception e) {
					System.out.println("Please Enter the Number Only");
				}
				int[] array = null;
				for(int i=number;i<last;i++)
				{
					status=file.primeNum(i);
					if(status)
					{
						for(int j=0;j<last;j++)
						{
							status1=file.primeNum(j);
							status2=file.anagram(i, j);
							if(status1&&status2&&i!=j)
							{
								//System.out.println(i+" : "+j);
								queue.enQueue(i);
								break;
							}
						}
					}
					
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b

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
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
				}
				queue.display();
				System.out.println("Program Ended");
			}
}
