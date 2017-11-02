package com.BridgeLabzs.program;

import com.BridgeLabzs.utility.FileUtility;
import com.BridgeLabzs.utility.StackImp;

public class SimpleBalnceParenthesis {
		public static void main(String[] args) {
			System.out.println("Program Started ");
<<<<<<< HEAD
<<<<<<< HEAD
			StackImp<String> s1=new StackImp<String>();
=======
			StackImp<String> s1=new StackImp<>();
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
=======
			StackImp<String> s1=new StackImp<>();
>>>>>>> 5644c715f5cd48bf187e78162bf07c7c213ebd5b
			FileUtility input=new FileUtility();
			boolean status;
			System.out.println("Please Enter the Expres.");
			String string=input.inputString();
			status=SimpleBalnceParenthesis.checkBalancedParenthesis(string);
			if(status) 
			{
				System.out.println("Balance");
			}
			else 
			{
				System.out.println("Not balance");
			}
			
			System.out.println("Program Ended");
		}
			 public static boolean checkBalancedParenthesis(String input){
					boolean mIsBalanaced = false;
					String mStr=null;
					StackImp<String> stack = new StackImp();
					for(int i=0; i < input.length(); i++){
						mStr = ""+input.charAt(i);

						if(mStr.equals("(") || mStr.equals("[") || mStr.equals("{")){
							stack.push(mStr);
						}

						if(mStr.equals(")") || mStr.equals("]") || mStr.equals("}")){
							if(stack.isEmpty()){
								return false;
							}
							String opening = (String)stack.peek();
							if(mStr.equals(")") && opening.equals("(")){
								stack.pop();
							}
							if(mStr.equals("]") && opening.equals("[")){
								stack.pop();
							}
							if(mStr.equals("}") && opening.equals("{")){
								stack.pop();
							}
						}			
					}
					if(input.length() > 0 && stack.isEmpty()){
						mIsBalanaced = true;
					}
			        return mIsBalanaced;
}
}
