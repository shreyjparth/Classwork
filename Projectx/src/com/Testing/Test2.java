package com.Testing;
import static com.Testing.Hello.*;
class Hello{
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
}
public class Test2 {
	static{
		System.out.println("MAIN STATIC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IN MAIN");
	    getMe();
		System.out.println(x+y);

	}

}
