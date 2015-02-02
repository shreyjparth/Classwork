package com.Exceptions;

public class FinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				System.out.println("Started");
				String s=args[0];
				System.out.println("Got Value");
				int y=Integer.parseInt(s);
				System.out.println("Value"+y);
				int x=25/y;
				System.out.println(x);
			}/* catch (NumberFormatException |ArithmeticException |NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */finally{
				System.out.println("\nHAHAHAHAH NO STOPPING ME BRO");
			}
		
		System.out.println("In main After Exception Occured");
	}

}
