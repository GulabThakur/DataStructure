package com.BridgeLabzs.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

<<<<<<< HEAD
<<<<<<< HEAD
public class FileUtility {

	BufferedReader br, rf = null;

	// Utility constructor for creating object for BufferedReader
	public FileUtility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	// input string
	/**
	 * @return
	 * @This method using for store a value
	 */
	public String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b

public class FileUtility {
	
	BufferedReader br,rf = null;
	//Utility constructor for creating object for BufferedReader
	public FileUtility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			System.out.println(e);
		}
		return "";
	}
<<<<<<< HEAD
<<<<<<< HEAD

	// input Integer
	/**
	 * @return
	 * @This method using for store a value
	 */
	public int inputInteger() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			System.out.println(e);
		}
		return 0;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// input double
	/**
	 * @return
	 * @This method using for store a value
	 */
	public double inputDouble() {
		try {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}

	// input boolean
	/**
	 * @return
	 * @This method using for store a value
	 */
	public boolean inputBoolean() {
		try {
			return Boolean.parseBoolean(br.readLine());
		} catch (Exception e) {
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			System.out.println(e);
		}
		return false;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// taking integer array input
	/**
	 * @param size
	 * @return
	 * @This method using for store a value
	 */
	public Integer[] inputIntArray(int size) {
		Integer array[] = new Integer[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter Element at " + (i + 1)
					+ " position: ");
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//taking integer array input
	public Integer[] inputIntArray(int size){
		Integer array[] = new Integer[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter Element at "+(i+1)+" position: ");
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			array[i] = this.inputInteger();
		}
		return array;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// taking String array input
	/**
	 * @param size
	 * @return
	 * @This method using for store a value
	 */
	public String[] inputStringArray(int size) {
		String array[] = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Please enter String at " + (i + 1)
					+ " position: ");
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//taking String array input
	public String[] inputStringArray(int size){
		String array[] = new String[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter String at "+(i+1)+" position: ");
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			array[i] = this.inputString();
		}
		return array;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// Array Printing(one dimensional) Generic type
	/**
	 * @param inputArray
	 *            @ this method using for print Generic array
	 */
	public <T> void printArray(T[] inputArray) {
		for (T i : inputArray)
			System.out.print(i + " ");
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//Array Printing(one dimensional) Generic type
	public <T> void printArray(T[] inputArray){
		for(T i:inputArray)
			System.out.print(i+" ");
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b

		System.out.println();
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// Array printing(two dimensional) Generic type
	/**
	 * @param inputArray
	 * @param row
	 * @param column
	 *            @ this method using for print Two Dimension array
	 */
	public <T> void printArray(T[][] inputArray, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(inputArray[i][j] + " ");
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//Array printing(two dimensional) Generic type
	public <T> void printArray(T[][] inputArray,int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(inputArray[i][j]+" ");
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			}
			System.out.println();
		}
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// reading file
	/**
	 * @param file
	 * @return @ this method using for read File
	 */
	public String readFile(File file) {

		try {
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		} catch (Exception e) {
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	//reading file
	public String readFile(File file){
		
		try{
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		}
		catch(Exception e){
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			System.out.println(e);
		}
		return "";
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// Writing into file int Data
	/**
	 * @param file
	 * @param data
	 * @this Method use for write file
	 */
	public void writeFile1(File file, int data) {
		try {
=======
	//Writing into file int Data
	public void writeFile1(File file,int data){
		try{
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
	//Writing into file int Data
	public void writeFile1(File file,int data){
		try{
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(data);
			wr.close();
<<<<<<< HEAD
<<<<<<< HEAD
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// writing into file String data
	/**
	 * @param file
	 * @param data
	 *            @ This method use for write file
	 */
	public void writeFile(File file, String data) {
		try {
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string + " " + data);
			wr.close();
		} catch (Exception e) {
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//writing into file String data
	public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			System.out.println(e);
		}
	}

<<<<<<< HEAD
<<<<<<< HEAD
	// Clear the Data inside the file
	/**
	 * @param f
	 *            @ this method use for ClearFile
	 */
	public void clearFile(File f) {
		try {
=======
	//Clear the Data inside the file
	public void clearFile(File f){
		try{
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
	//Clear the Data inside the file
	public void clearFile(File f){
		try{
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
<<<<<<< HEAD
<<<<<<< HEAD
		} catch (Exception e) {
			System.out.println(e);
		}

=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
		}
		catch(Exception e){
			System.out.println(e);
		}
		
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	}

	/**
	 * @param string
<<<<<<< HEAD
<<<<<<< HEAD
	 * @return using check palindrom string
	 */
	public static boolean check(String string) {
		Dequeue que = new Dequeue();
		char first, last, c;
		boolean status = true;
		// char array[]=string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			que.insertRear(c);
		}
		while (que.size() > 1) {
			first = que.removeFront();
			last = que.removeRear();
			// System.out.println(first);
			// System.out.println(last);
			if (first != last) {
				status = false;
				break;
			}

		}

		return status;

	}

	/**
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	 * @return
	 * using check palindrom string 
	 */
	public static  boolean check(String string) 
	{
		Dequeue que=new Dequeue();
		char first,last,c;
		boolean status = true;
		//char array[]=string.toCharArray();
		for(int i=0;i<string.length();i++)
		{
			 c =string.charAt(i);
			que.insertRear(c);
		}
		while(que.size()>1) 
		{
			first=que.removeFront();
			last=que.removeRear();
		   // System.out.println(first);
		  //	System.out.println(last);
			if(first!=last) 
			{
				status=false;
				break;
			}
			
			
		}
		
		return status;
		
	}
	 /**
<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
	 * @param year
	 * @param month
	 * @return this method use for return odd day of week
	 * 
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public static int dayCode(int year, int month) {
		int m, x, d, y;
		int day = 1;
		y = year - (14 - month) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = month + 12 * ((14 - month) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;
		// System.out.println(d);
		return d;
	}

	/**
	 * @param num
	 * @param n
	 *            print the prime number in range
	 */
	public void print(int num, int n) {
		FileUtility pm = new FileUtility();
		boolean status;
		int i = 1;
		for (num = 2; num <= n; num++) {
			status = pm.primeNum(num);
			if (status) {
				if (num > 100 && i == 1) {
					System.out.println();
					i = 0;
				}
				if (num > 200 && i == 0) {
					System.out.println();
					i = 2;
				}
				if (num > 300 && i == 2) {
					System.out.println();
					i = 3;
				}
				if (num > 400 && i == 3) {
					System.out.println();
					i = 4;
				}
				if (num > 500 && i == 4) {
					System.out.println();
					i = 5;
				}
				if (num > 600 && i == 5) {
					System.out.println();
					i = 6;
				}
				if (num > 700 && i == 6) {
					System.out.println();
					i = 7;
				}
				if (num > 800 && i == 7) {
					System.out.println();
					i = 8;
				}
				if (num > 900 && i == 8) {
					System.out.println();
					i = 9;
				}

				System.out.print(num + " ");

			}
		}
		System.out.println();
	}

	/**
	 * @param num
	 * @return chech this number prime
	 */
	public static boolean primeNum(int num) {
		if (num < 2) {
			return false;
		} else {
			int temp;
			for (int i = 2; i <= num / 2; i++) {
				temp = num % i;
				if (temp == 0) {
					return false;

				}
			}
			return true;
		}

	}

	/**
	 * @param num
	 * @return
	 */
	public boolean pallindrom(int num) {
		long reverse = 0;
		long n = num;
		while (n != 0) {
			reverse *= 10;
			reverse = reverse + n % 10;
			n /= 10;
		}
		if (reverse == num) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param num
	 * @param num1
	 * @return
	 */
	public boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}

	/**
	 * @param n
	 */
	/**
	 * @param n
	 *            @ This method use for display Anagram Number
	 */
	public static void dispAngram(int n) {
		int num = n;
		FileUtility file = new FileUtility();
		boolean status2, status, status1;
		int k = 1;
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				status2 = file.anagramNum(i, j);
				status1 = file.primeNum(i);
				status = file.primeNum(j);
				if (status2 && status && status1) {

					while (i > 100 && j > 100 && k == 1) {
						System.out.println();
						k = 0;
					}
					while (i > 200 && j > 200 && k == 0) {
						System.out.println();
						k = 2;
					}
					while (i > 300 && j > 300 && k == 2) {
						System.out.println();
						k = 3;
					}
					while (i > 400 && j > 400 && k == 3) {
						System.out.println();
						k = 4;
					}
					while (i > 500 && j > 500 && k == 4) {
						System.out.println();
						k = 5;
					}
					while (i > 600 && j > 600 && k == 5) {
						System.out.println();
						k = 6;
					}
					while (i > 700 && j > 700 && k == 6) {
						System.out.println();
						k = 7;
					}
					while (i > 800 && j > 800 && k == 7) {
						System.out.println();
						k = 8;
					}
					while (i > 900 && j > 900 && k == 8) {
						System.out.println();
						k = 9;
					}
					System.out.print(" " + i + " ");
					System.out.print(" " + j + " ");
				}

			}
		}
		System.out.println();
	}

	/**
	 * @param value
	 * @return for search Node
	 */
	public long bineryNode(long value) {
		long sum = 0;

		if (value <= 1) {
			return 1;
		} else {
			for (int i = 1; i <= value; i++) {
				sum = (sum + bineryNode(i - 1) * bineryNode(value - i));

			}
			return sum;
		}
	}

	/**
	 * @param number
	 * @param number2
	 * @return
	 */
	public boolean anagram(int number, int number2) {
		if (number >= 13 && number2 >= 13) {
			String string = Integer.toString(number);
			char[] charArray = string.toCharArray();
			String string2 = Integer.toString(number2);
			char[] charArray2 = string2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			string = new String(charArray);
			string2 = new String(charArray2);
			if (string.length() == string2.length()) {
				if (string.equals(string2)) {
					return true;
				} else
					return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * @param start
	 * @param end
	 * @return
	 */
	public LinkedList<Integer> primeNumber(int start, int end) {
		int length = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int a = start; a < end; a++) {
			int number = a, count = 0;

			for (int i = 0; i <= number; i++) {
				count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
			}

			if (count == 0) {
				list.add(a);
			}
		}
		return list;
	}

	/**
	 * @param array
	 *            accept array
	 * @return and return array
	 */
	public int[] removeDupalicate(int[] array) {
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (array.length < 2) {
			return array;
		}
		while (i < array.length) {
			if (array[i] == array[j]) {
				i++;
			} else {
				array[++j] = array[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = (Integer) array[k];
		}

		return output;
	}

	/**
	 * To Store Ascending Oder
	 */
	public void toAsendingoder(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++)

		{

			for (int j = i + 1; j < array.length; j++)

			{

				if (array[i] > array[j])

				{

					temp = array[i];

					array[i] = array[j];

					array[j] = temp;

				}

			}

		}
	}

}
=======
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
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
	
	/**
	 * @param num
	 * @param n
	 * print the prime number in range
	 */
	public void print(int num,int n) 
	{
		 FileUtility pm=new  FileUtility();
		boolean status;
		 int i=1;
		    for(num =2;num<=n;num++)
			  {
			  status=pm.primeNum(num);
			  if(status)
			   {
				  if(num>100 && i==1) 
				  {
					  System.out.println();
					  i=0;
				  }
				  if(num>200 && i==0) 
				  {
					  System.out.println();
					  i=2;
				  }
				  if(num>300 && i==2) 
				  {
					  System.out.println();
					  i=3;
				  }
				  if(num>400 && i==3) 
				  {
					  System.out.println();
					  i=4;
				  }
				  if(num>500 && i==4) 
				  {
					  System.out.println();
					  i=5;
				  }
				  if(num>600 && i==5) 
				  {
					  System.out.println();
					  i=6;
				  }
				  if(num>700 && i==6) 
				  {
					  System.out.println();
					  i=7;
				  }
				  if(num>800 && i==7) 
				  {
					  System.out.println();
					  i=8;
				  }
				  if(num>900 && i==8) 
				  {
					  System.out.println();
					  i=9;
				  }
				  
				 System.out.print(num+" ");
			    
			   }
			  }
		  System.out.println();}
	/**
	 * @param num
	 * @return
	 * chech this number prime
	 */
	public static boolean primeNum(int num)
	{
	  for(int i=2;i<num;i++)
		{
		   if(num%i==0)
			{
			  return false;
			}
		
		}
	return true;
	} 
	 
 /**
 * @param num
 * @return
 */
public boolean pallindrom(int num)
	       {
	         long reverse = 0;
	         long n = num;
	         while (n != 0)
	        {
	             reverse *= 10;
	            reverse = reverse + n % 10;
	            n /= 10;
	         }
		if(reverse==num)
	         {
	         	return true;
	         }  
	         else
	         {
	             return false;
	         }
	       }
/**
 * @param num
 * @param num1
 * @return
 */
public boolean anagramNum(int num,int num1) 
{
	String str1="";
	String str2="";
	str1=String.valueOf(num);
	str2=String.valueOf(num1);
	char[] charFromWord = str1.toCharArray();
    char[] charFromAnagram = str2.toCharArray();       
    Arrays.sort(charFromWord);
    Arrays.sort(charFromAnagram);
    return Arrays.equals(charFromWord, charFromAnagram);

 }
/**
 * @param n
 */
public static void dispAngram(int n) 
{   
	 int num=n;
  FileUtility file=new FileUtility();
  boolean status2,status,status1;
  int k=1;
  for(int i=2;i<n;i++) 
  {
	  for(int j=i+1;j<num-1;j++) 
	  {
		  status2=file.anagramNum(i, j);
		  status1=file.primeNum(i);
		  status=file.primeNum(j);
		  if(status2&&status&&status1) 
		  {  

			  while(i>100 && j>100 && k==1) 
			  {
				  System.out.println();
				  k=0;
			  }
			 while(i>200 && j>200 && k==0) 
			  {
				  System.out.println();
				  k=2;
			  }
			  while(i>300 && j>300 && k==2) 
			  {
				  System.out.println();
				  k=3;
			  }
			  while(i>400 && j>400 && k==3) 
			  {
				  System.out.println();
				  k=4;
			  }
			  while(i>500 && j>500 && k==4) 
			  {
				  System.out.println();
				  k=5;
			  }
			  while(i>600 && j>600 && k==5) 
			  {
				  System.out.println();
				  k=6;
			  }
			  while(i>700 && j>700 && k==6) 
			  {
				  System.out.println();
				  k=7;
			  }
			  while(i>800 && j>800 && k==7) 
			  {
				  System.out.println();
				  k=8;
			  }
			  while(i>900 && j>900&& k==8) 
			  {
				  System.out.println();
				  k=9;
			  }
			  System.out.print(" "+i+" ");
			  System.out.print(" "+j+" ");
		  }
		 
	  }
 }
 System.out.println();
}
/**
 * @param value
 * @return
 * for search Node 
 */
public long bineryNode(long value)
{
	long sum = 0;
	
	if(value<=1)
	{
	  return 1;
	}
	else 
	{ 
		for(int i=1;i<=value;i++)
		{
			sum=(sum+bineryNode(i-1)*bineryNode(value-i));
			
		}
		return sum;
	}
}
/**
 * @param number
 * @param number2
 * @return
 */
public boolean anagram(int number, int number2)
{
	String string=Integer.toString(number);
	char[] charArray=string.toCharArray();
	String string2=Integer.toString(number2);
	char[] charArray2=string2.toCharArray();
	Arrays.sort(charArray);
	Arrays.sort(charArray2);
	string=new String(charArray);
	string2=new String(charArray2);
	if(string.length()==string2.length())
	{
		if(string.equals(string2))
		{
			return true;
		}
		else
			return false;
	}
	else{
		return false;
	}
}
/**
 * @param start
 * @param end
 * @return
 */
public LinkedList<Integer> primeNumber(int start, int end)
{
	int length=0;
	LinkedList<Integer> list=new LinkedList<Integer>();
	for(int a=start; a<end; a++)
	{
		int number = a, count=0;

		for (int i = 1; i <= number; i++)
		{
			count = 0;
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count++;
					break;
				}
			}
		}

		if(count==0)
		{
			list.add(a);
		}
	}
	return list;
}
}

<<<<<<< HEAD
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
