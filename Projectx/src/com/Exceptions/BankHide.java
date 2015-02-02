package com.Exceptions;

class BankHi {
	int bal=4000;
	void withdraw(int x) throws NegetiveBalanceException,OverDraftException,Exception{
		int v=bal-x;
		try{
			if(v==0){
				//throw new NegetiveBalanceException("NEGETIVE BALANCE");
			}
			else if(x>500){
				//throw new OverDraftException("OVER DRAFT NOT ALLOWED");
			}
			else{
				bal=bal-x;
			System.out.println("Bakance is"+bal);	
			}
			}catch(Exception e){
				System.out.println("Caought Exception");
				throw e;
			}finally{
				System.out.println("CLOSE");
			}
		System.out.println("Server Over");
	}
}

public class BankHide{
	public static void main(String[] args) {
		try{
			System.out.println("IN ATM");
			int val=Integer.parseInt(args[0]);
			System.out.println("Value given");
			BankHi ex=new BankHi();
			ex.withdraw(val);
			System.out.println("Amount Withdrawn");
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println();
	}
}
