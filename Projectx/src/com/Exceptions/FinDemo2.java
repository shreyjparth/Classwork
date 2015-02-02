package com.Exceptions;
class Bank1{
		int bal=3000;
		void withdraw(int x) throws Exception{
		try{
			if(x>3000){
				throw new Exception();
			}
			else{
			System.out.println("In Server");	
			int b=1000/x;
			}
		}catch(Exception e){
			System.out.println("EEEEEERORRRRR!!");
			throw e;
		}		
		finally{
			System.out.println("Closing database");
		}
		System.out.println("Server Done");
	}
}

public class FinDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
			Bank b=new Bank();
			try{
			b.withdraw(x);
			
		}catch(Exception e){
			System.out.println("Exception Occcurerd");
		}
		System.out.println("Bubye");		
	}

}
