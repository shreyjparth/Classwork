package com.Testing;

class Xyz{
	Xyz(){
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	static{
		System.out.println("STATIC OUTER CLASS 1");
	}
}

public class Abc extends Xyz {
	int x,y;
static{
	System.out.println("Static 1");
}
static{
	System.out.println("Static 2");
}
	Abc(){
		System.out.println("Default Constructor");
	}
	{
		System.out.println("INIT BLOCK 1");
	}
	{
		System.out.println("INIT BLOCK 2");
	}
	public Abc(int x, int y) {
	super();
	this.x = x;
	this.y = y;
	System.out.println("Parameter Constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Abc a=new Abc();
     Abc b=new Abc(10,20);
	}

}


