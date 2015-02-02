package com.inheritance;

class Job{
	String name;
	int age;
	
	public Job(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	Job(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		name="Ram";
		age=22;
		System.out.println("IN SUPER CLASS CONS");
		System.out.println("After Name:"+name);
		System.out.println("After Age:"+age);
	}
	
	void m1(){
		System.out.println("In super m1");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Man extends Job{
	
	public Man(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	Man(){
		System.out.println("Name:"+name+"age"+age);
		name="Asha";
		age=24;
		System.out.println("IN SUB CLASS");
		System.out.println("After name"+name+"After age"+age);
	}
}
public class Test3{

	public static void main(String[] args) {
		Job e=new Job();
		Man ob=new Man();
		e.m1();
		ob.m1();
		

	}

}
