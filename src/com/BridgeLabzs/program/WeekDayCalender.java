package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.Linklist;
import com.BridgeLabzs.utility.Queue;

public class WeekDayCalender {
	static String month[]= {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	 static int day[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	 static char week[]= {' ','S','M','T','W','T','F','S'};
	 static int months;
     public static void main(String[] args) {
    	 FileUtility fu=new FileUtility();
    	 System.out.println("Program Started");
    	 System.out.println("Please Enter the year ");
    	 int year=fu.inputInteger();
    	 System.out.println("Please Enter the months");
    	 months=fu.inputInteger();
    	 WeekDayCalender.leafYear(year);
    	 int daycode=WeekDayCalender.dayCode(year, months);
    	 WeekDayCalender.store(daycode);
    	 WeekDayCalender.print(year, daycode);
    	
    	 System.out.println();
    	 System.out.println("Program Ended");
		
	}
     public static int dayCode(int year, int month) 
     {
    	 int m,x,d,y;
		 int day=1;
		 y=year-(14-month)/12;
		 x=y+y/4-y/100+y/400;
		 m = month + 12 *((14-month)/12)-2;
		 d = (day+ x + (31*m) / 12)%7;
		 //System.out.println(d);
		return d;
     }
     public static void leafYear(int year) 
     {
    	 if(year%4==0 && year%100!=0 ||year%400==0) 
   	  {
   		  day[2]=29;
   	  }
     }
     public static void store(int daycode)
     {
    	 Linklist list=new Linklist();
    	 int k=1;
    	 for(int i=1;i<=day[months];i++) 
    	 {
    		 list.insert(i, week[k]);
    		 k++;
    		 if((i+daycode)%7==0||i==day[months]) 
    		 {
    			 k=1;
    		 }
    	 }
    	list.dispaly();
     }
     public static   void print(int year, int daycode)
     {
    	 
     	for(int i=1;i<=1;i++) 
     	{
     		System.out.println("     "+month[months]+" "+year);
     		System.out.println("sun mon tue wen thu fri sat");
     		for(int j=1;j<=1+daycode*5;j++) 
     		{
     			System.out.print(" ");
     		}
     		for(int j=1;j<= day[months];j++) 
     		{
     			System.out.print(j+"  ");
     			if((j+daycode)%7>0) 
     			{
     				System.out.print(" ");
     			}else 
     			{
     				System.out.print("\n");
     			}
     		}
     		daycode=(daycode+day[months])%7;
     	}
     }
}
