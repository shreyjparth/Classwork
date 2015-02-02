package com.test1;

class Obj {
int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Obj d1=new Obj();
		d1.x=10;
		d1.y=20;
		System.out.println(d1.x+" "+d1.y);
		Obj d2=new Obj();
		d2.x=100;
		d2.y=200;
		System.out.println(d2.x+" "+d2.y);
		Obj d3=d2;
		d3.x=99;
		d3.y=99;
		System.out.println(d2.x+" "+d2.y);
		d1=null;
		
		
		

	}

}
