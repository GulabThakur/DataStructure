package com.BridgeLabzs.program;

import java.util.Scanner;

public class CalenderProgram {
		 static String month[]= { " ","Jan","Feb","March","Apr","May","Jun","Julye","Augst","Sep","Oct","Nov","Dec"};
         static int[] day= {0,31,28,31,30,31,30,31,31,30,31,30,31};	
         static int year;
         static int months; 
         public static void main(String[] args) {
        	System.out.println("Program Started ");
        	Scanner scanner=new Scanner(System.in);
        	System.out.println("Please Enter the year ");
        	year=scanner.nextInt();
        	System.out.println("Please Enter the moths");
        	months=scanner.nextInt();
        	CalenderProgram.leapYear(year);
        	int daycode=CalenderProgram.calender(1, year, months);
        	CalenderProgram.print(year, daycode);
        	System.out.println();
			System.out.println("Program Ended");
		}
       public static   void print(int year, int daycode)
         {
         	for(int i=1;i<=1;i++) 
         	{
         		System.out.println("     "+month[months]+" "+year);
         		System.out.println("sun  mon  tue  wen  thu  fri sat");
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
         public static void leapYear(int year) 
         {
        	  if(year%4==0 && year%100!=0 ||year%400==0) 
        	  {
        		  day[2]=29;
        	  }
         }
         public static int calender(int day,int year,int month) {
		 int m,x,d,y;
		 day=1;
		 y=year-(14-month)/12;
		 x=y+y/4-y/100+y/400;
		 m = month + 12 *((14-month)/12)-2;
		 d = (day+ x + (31*m) / 12)%7;
		 //System.out.println(d);
		return d;
 }
		
}
