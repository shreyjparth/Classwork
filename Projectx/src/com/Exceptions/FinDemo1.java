package com.Exceptions;
class Bank{
		void withdraw(int x){
		try{
			System.out.println("In Server");	
			int b=x/0;
		}catch(Exception e){
			System.out.println("EEEEEERORRRRR!!");
		}
		finally{
			System.out.println("Closing database");
		}
		System.out.println("Server Done");
	}
}

public class FinDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		try{
			Bank b=new Bank();
			b.withdraw(x);
			
		}catch(Exception e){
			System.out.println("Exception Occcurerd");
		}
		System.out.println("Bubye");		
	}

}
