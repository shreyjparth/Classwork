package com.inheritance;

class Test{
	
		Test(){
			System.out.println("Hello");
		}
		Test(int x){
			this("Ram");
			System.out.println("Value:"+x);
		}
		Test(String a){
			this();
			System.out.println("Name:"+a);
		}
	public static void main(String[] args) {
		Test t=new Test(10);
	}

}
