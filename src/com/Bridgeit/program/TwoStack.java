package com.Bridgeit.program;

import com.BridgeLabzs.program.UsingStack1;
import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.UsingStack;

public class TwoStack {
	static String month[]= {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	 static int day[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	 static int months;
	 static int year;
    public static void main(String[] args) {
		System.out.println("Program Started");
		UsingStack<Integer> usin=new UsingStack<Integer>();
		UsingStack1<String> usin1=new UsingStack1<String>();
		FileUtility file=new FileUtility();
		System.out.println("Please Enter the months");
		try {
			
			 months=file.inputInteger();
		} catch (Exception e) {
			System.out.println("Please Enter the number");
		}
		System.out.println("Please Enter the year");
		try {
			 year=file.inputInteger();
		} catch (Exception e) {
			System.out.println("Please Enter the Intger Formate");
		}
 		String  array[]= {"s","m","t","w","t","f","s"};
 		System.out.println("  "+month[months]+" "+year);
	    for(int k=0;k<array.length;k++)
	    	//for store the date
		usin1.push(array[k]);
	    // for display the date
		usin1.display();
		//this method use for odd day
		int value=file.dayCode(year, months);
		System.out.println();
		for(int i=1;i<=day[months];i++) 
			//for store the day 
			usin.push(i);
		//for display calender
		usin.disp(value);
		System.out.println();
		System.out.println("Program Ended");
	}
   
}
