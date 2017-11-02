package com.BridgeLabzs.utility;

public class Queue<T>{
       int mTop=-1,mCp=5;
       int front=0;
<<<<<<< HEAD
<<<<<<< HEAD
       Object arr[]=new Object [mCp];
=======
       Object arr[]=new Object[mCp];
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
       Object arr[]=new Object[mCp];
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
       public void enQueue(T value)
       {
    	   if(mTop<mCp-1) 
    	   {
    		   mTop=mTop+1;
    		   arr[mTop]=value;
    	   }
    	   else 
    	   {
    		   mCp=mCp+5;
    		   Object onb[]=new Object[mCp];
    		   for(int i=0;i<arr.length;i++) 
    		   {
    			   onb[i]=arr[i];
    		   }
    		   arr=onb;
    		   mTop=mTop+1;
    		   arr[mTop]=value;
    	   }
       }
       public void deQueue() 
       {
    	   if(mTop>=front) 
    	   {   
    		   front=front+1;
    		   System.out.println("deQueue is Done");
    	   }
    	   else
    	   {
    		   System.out.println("Queue is Empty");
    	   }
       }
<<<<<<< HEAD
<<<<<<< HEAD
       public Object[] display() 
       {
    	   for(int i=front;i<=mTop;i++) 
    	   {
    		  System.out.print(arr[i]+" ");
    	   }
    	   System.out.println();
		return arr;
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
       public void display() 
       {
    	   for(int i=front;i<=mTop;i++) 
    	   {
    		   System.out.print(arr[i]+" ");
    	   }
    	   System.out.println();
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
       }
       public void size() 
       {
    	   System.out.println((mTop+1)+" ");
       }
}
