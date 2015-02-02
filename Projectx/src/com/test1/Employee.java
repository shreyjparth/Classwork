package com.test1;
//import java.util.*;

class Emp{
	String Name=new String();
	int salary;
	Emp(String name,int salary){
		this.Name=name;
		this.salary=salary;
		
	}
	void getDetails(){
		System.out.println("Name"+" "+Name);
		System.out.println("Salary"+" "+salary);
		}
	
}

class Employee {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp a=new Emp("Rahul",100);
		Emp b=new Emp("Shrey",200);
		a.getDetails();
		b.getDetails();
		}
}