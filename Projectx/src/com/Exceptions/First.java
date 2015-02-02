package com.Exceptions;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Started");
			String s=args[0];
			System.out.println("Got Value");
			int y=Integer.parseInt(s);
			System.out.println("Value"+y);
			int x=25/y;
			System.out.println(x);
		} catch(Exception e){
			System.out.println("Divide By Zero");
		}
		System.out.println("In main After Exception Occured");
	}

}
