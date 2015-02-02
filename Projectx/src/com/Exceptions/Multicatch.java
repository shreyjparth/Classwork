package com.Exceptions;

public class Multicatch {

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
		} catch(NumberFormatException e){
			System.out.println("Wrong Fromat Entered");
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("NO VALUE ENTERED");
		}catch(ArithmeticException a){
			System.out.println("DIVIDE BY ZERO");
		}catch(Exception b){
			System.out.println("Exception Ocuured");
		}
		System.out.println("In main After Exception Occured");
	}

}
