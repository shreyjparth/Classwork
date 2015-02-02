package com.inheritance;

public class Test2 {
		
	String s;
	String name;
	int salary;
	
	Test2(){
		System.out.println("Default");
		getDetail();
	}
	
	Test2(String name,int salary,String s){
	this(name,salary);
	System.out.println("In 3 Para");
	getDetail();
	this.s=s;			
	}
	
	Test2(String name,int salary){
		this(name);
		System.out.println("In 2 Para");
		getDetail();
		this.salary=salary;
	}
	
	Test2(String name){
		this();
		System.out.println("In 1 Para");
		getDetail();
		this.name=name;
	}
	
	void getDetail(){
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Comnpany:"+s);
	}
	public static void main(String[] args) {
		Test2 t=new Test2("Ram",1000,"Sapient");
		t.getDetail();
}

}
