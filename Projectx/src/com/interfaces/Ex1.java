package com.interfaces;

interface Fly{
	void m1();
	void m2();
	int v=10;
	
}
class IA implements Fly{
	public void m1(){
		System.out.println("Method 1");
	}
	public void m2(){
		System.out.println("Method 1");
	}
	
	public String method(){
		return "IN FIRST";
	}
}
abstract class Example implements Fly{
	public void m1(){
		System.out.println("Method 1");
	}
}
class Exx extends Example{
	public void m2(){
		System.out.println("Method 2");
	}
	public String method(){
		return "IN SECOND";
	}
	
}
class Ex1{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fly ref;
		ref=new Exx();
		ref.m1();
		ref.m2();
		System.out.println(Exx.v);
		System.out.println(new Exx().method());
		ref=new IA();
		ref.m1();
		ref.m2();
		
				
		}

}
