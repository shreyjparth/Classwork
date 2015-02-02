package com.test1;

class Vararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vararg s=new Vararg();
		s.calSum("RAM");
		s.calSum("RAM",10);
		s.calSum("RAM",10,20);
	
	}
	void calSum(String name,int...b){
		System.out.println("Welcome"+name);
		int sum=0;
		for(int v:b)
			sum=sum+v;
		System.out.println("Sum"+sum);
	}
	void calSum(String name){
		System.out.println("Have a good day"+name);
	}
}
