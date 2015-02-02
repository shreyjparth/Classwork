package com.Testing;

class Stat{
	static int x,y =20;
	
	static{
		System.out.println("BYE BYE");
		x=10;
	}
	static{
		System.out.println("HELLO");
	}
	static void getMe(){
		System.out.println("Statci Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main");
		getMe();
		System.out.println("value:"+(x+y));
		
	}

}
