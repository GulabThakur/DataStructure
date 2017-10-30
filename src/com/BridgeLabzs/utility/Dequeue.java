package com.BridgeLabzs.utility;

import java.util.ArrayList;
import java.util.List;

public class Dequeue {
	  private List<Character> deque = new ArrayList<Character>();
	     
	    public void insertFront(int item){
	        //System.out.println("adding at front: "+item);
	        deque.add((char) item);
	      //  System.out.println(deque);
	    }
	     
	    public char insertRear(int i){
	      //  System.out.println("adding at rear: "+i);
	        deque.add((char) i);
	       // System.out.println(deque);
			return (char) i;
	    }
	     
	    public char removeFront(){
	        if(deque.isEmpty()){
	            System.out.println("Deque underflow!! unable to remove.");
	            
	            return 0;
	        }
	        char rem = deque.remove(0);
	       // System.out.println("removed from front: "+rem);
	       // System.out.println(deque);
			return rem;
	    }
	     
	    public char  removeRear(){
	        if(deque.isEmpty()){
	            System.out.println("Deque underflow!! unable to remove.");
	            return 0;
	        }
	        char rem = deque.remove(deque.size()-1);
	       // System.out.println("removed from front: "+rem);
	       // System.out.println(deque);
			return rem;
	    }
	     
	    public int peakFront(){
	        char item = deque.get(0);
	        System.out.println("Element at first: "+item);
	        return item;
	    }
	     
	    public int peakRear(){
	        char item = deque.get(deque.size()-1);
	        //System.out.println("Element at rear: "+item);
	        return item;
	    }
	    public int size() 
	    {
	    	int size=deque.size();
			return size;
	    	
	    }
}
