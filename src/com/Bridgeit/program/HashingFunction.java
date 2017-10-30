package com.Bridgeit.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.OderNode;

public class HashingFunction {
        static File file=new File("/home/brideit/Gulab Thakur/eclip/DataStructure/src/Oder.txt"); 
        static OderNode node=new OderNode();
        static FileUtility fileutility=new FileUtility();
        static String string=fileutility.readFile(file);
        
        public static void main(String[] args) throws IOException {
        	System.out.println("Contain of file is "+string);
        	string = string.trim();
    		String strArray[] = string.split(" ");
    		
    		for(int i=0;i<strArray.length;i++){
    			node.addNode(Integer.valueOf(strArray[i]));
    		}
    		
    		System.out.print("List Elements are: ");
    		node.showList();

    		System.out.print("\nPlease Enter the element you want to Search: ");
    		int value = fileutility.inputInteger();
    	    node.search(value); 
        	HashMap hashmap=new  HashMap();
        	LinkedList<Integer> l1=new  LinkedList<Integer>();
        	LinkedList<Integer> l2=new  LinkedList<Integer>();
        	LinkedList<Integer> l3=new  LinkedList<Integer>();
        	LinkedList<Integer> l4=new  LinkedList<Integer>();
        	LinkedList<Integer> l5=new  LinkedList<Integer>();
        	LinkedList<Integer> l6=new  LinkedList<Integer>();
        	LinkedList<Integer> l7=new  LinkedList<Integer>();
        	LinkedList<Integer> l8=new  LinkedList<Integer>();
        	LinkedList<Integer> l9=new  LinkedList<Integer>();
        	LinkedList<Integer> l10=new LinkedList<Integer>();
        	BufferedReader br=null;
    		try {
				br=new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str=" ";
			str=fileutility.readFile(file);
			str=str.trim();
			String[]  array1= str.split(" ");
			Integer array[]=new Integer[array1.length];
				
			int k;
			for(int i=0;i<array.length-1;i++) 
			{
				
				k=Integer.valueOf(array1[i])%11;
				
				if(k==0) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l1.add(array[i]);
					hashmap.put(k, l1);
					
				}
				if(k==1) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l2.add(array[i]);
					hashmap.put(k, l2);
				}
				if(k==2) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l3.add(array[i]);
					hashmap.put(k, l3);
				}
				if(k==3) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l4.add(array[i]);
					hashmap.put(k, l4);
				}
				if(k==4) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l5.add(array[i]);
					hashmap.put(k, l5);
				}if(k==5) 
				{
					l6.add(array[i]);
					hashmap.put(k, l6.add(array[i]));
				}
				if(k==6) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l7.add(array[i]);
					hashmap.put(k, l7.add(array[i]));
				}
				if(k==7) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l8.add(array[i]);
					hashmap.put(k, l8);
				}
	
				if(k==8) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l9.add(array[i]);
					hashmap.put(k, l9);
				}
				
				if(k==9) 
				{
					array[i]=Integer.valueOf(array1[i]);
					l10.add(array[i]);
					hashmap.put(k, l10);
				}
				
			}
			System.out.println(hashmap);
		}
        
        
}
