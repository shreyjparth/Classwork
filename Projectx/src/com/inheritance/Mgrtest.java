package com.inheritance;

class Emp{
	String name;
	int id;
	String city;
	
	void getDetails(){
		System.out.println("In super class");
		System.out.println(name);
		System.out.println(id);
		System.out.println(city);
	}
}

class Mgr extends Shape{
	int salary;
	void calsalary(){
		System.out.println("In sub class");
		System.out.println("Salary:"+salary);
	}
}

public class Mgrtest {

	public static void main(String[] args) {
		Shape e=new Shape();
		//e.name="Ram";
		

	}

}
