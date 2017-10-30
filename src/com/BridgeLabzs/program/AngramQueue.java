package com.BridgeLabzs.program;

import java.util.LinkedList;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Queue1;

public class AngramQueue {
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
		
		Queue1<String> queue=new Queue1<String>();
		for(int i =0; i<list2.size(); i++)
		{
			queue.enqueue(list2.get(i));
		}
		queue.getelement();
		
}
}
