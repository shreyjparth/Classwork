package com.test1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		
		switch(s){
		
		case "Sun":
			System.out.println("Hot");
		break;
		
		case "Moon":
			System.out.println("Cold");
			break;
			default:
				System.out.println("You Fool");
				
		}
		
	}

}
