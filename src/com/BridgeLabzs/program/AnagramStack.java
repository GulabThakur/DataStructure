package com.BridgeLabzs.program;

import java.util.LinkedList;
import java.util.Stack;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Queue1;
import com.BridgeLabzs.utility.StackImp;

public class AnagramStack {
	public static void main(String[] args) {
		FileUtility utility=new FileUtility();
		int start=1;
		int end=1000;
		LinkedList<Integer> list=new LinkedList<Integer>();
		list=utility.primeNumber(start, end);
		
		LinkedList<String> list2=new LinkedList<String>();
		for(int i=0; i<list.size()-1; i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i)!=null)
				{
					if(utility.anagram(list.get(i), list.get(j)))
					{
						list2.add(list.get(i)+"-"+list.get(j));
					}
				}
			}
		}
		Stack<String> stack=new Stack<String>();
		for(int i=0; i<list2.size(); i++)
		{
			stack.push(list2.get(i));
		}
		String[] array=new String[stack.size()];
		for(int i=0; i<stack.size(); i++)
		{
			array[i]=stack.get(i);
		}
		
		System.out.println("Anagram NUmbers List into the Stack.");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]+" ");
		}
}
}
