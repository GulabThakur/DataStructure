<<<<<<< HEAD
<<<<<<< HEAD
package com.Bridgeit.utility;
=======
package com.BridgeLabzs.utility;
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
package com.BridgeLabzs.utility;
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b

public class UsingStack<T>{
	 Node head;
     public class Node<T>
     {
    	 T data;
    	 Node next;
    	 
    	 
     }
    
     public void push(T value) 
	 {
    	 Node temp = new Node();
    		temp.data=value;
    		temp.next=null;
    		
    		if(head==null) {
    			head=temp;
    			return;
    		}
    		Node temp1=head;
    		while(temp1.next!=null) {
    			temp1=temp1.next;
    		}
    		temp1.next=temp;
	 }
     public void disp(int i) 
     {
    	 for(int j=1;j<=i+1;j++) 
  		{
  			System.out.print("  ");
  		}
    	 Node temp=head;
    	 while(temp!=null) 
    	 {
    		 System.out.print(temp.data+" ");
    		 temp=temp.next;
    		 i++;
    		 if(i%7==0)
    			 System.out.println();
    	 }
     }
     
    public void disp1() {
    	 Node temp=head;
    	 
    	 while(temp!=null) {
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	 }
     }
}
