package com.BridgeLabzs.program;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Scanner;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Stack;
=======
import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.StackImp;
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.StackImp;
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b

public class PrimeStack {
			public static void main(String[] args) {
				System.out.println("Program Started");
<<<<<<< HEAD
<<<<<<< HEAD
				System.out.println("Please Enter the Number Starting point");
				Stack<Integer> stack=new Stack<Integer>(); 
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
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
				StackImp<Integer> stack=new StackImp<Integer>();
				FileUtility file =new FileUtility();
				boolean status,status1,status2;
				System.out.println("Anagram Number add in statck...");
				for(int i=2;i<1000;i++) 
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
				{
					status=file.primeNum(i);
					if(status)
					{
<<<<<<< HEAD
<<<<<<< HEAD
						for(int j=0;j<last;j++)
						{
							status1=file.primeNum(j);
							status2=file.anagram(i, j);
							if(status1&&status2&&i!=j)
							{
								//System.out.println(i+" : "+j);
								stack.push(i);
								break;
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
						for(int j=13;j<1000;j++) 
						{
							status1=file.primeNum(j);
							if(status && status1) {
							   status2=file.anagramNum(i, j);
							   if(status2) 
							   {
								   stack.push(i);
							  
							   }
							   
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
							}
						}
					}
					
				}
<<<<<<< HEAD
<<<<<<< HEAD
				stack.disp();
=======
				//stack.disp();
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
				//stack.disp();
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
				System.out.println("Program Ended");
			}
}
