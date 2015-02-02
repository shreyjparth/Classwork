package com.Testing;

abstract class Bank{
	int val=100;
	abstract void cl();
	abstract void hl();
	abstract void vl();
	final void admin(){
		System.out.println("ADMIN");
	}
}

class Branch1 extends Bank{
	void cl(){
		System.out.println("Car loan");
	}
	void hl(){
		System.out.println("Home loan");
	}
	void vl(){
		System.out.println("Vehicle loan");
	}
	void bdetails(){
		System.out.println("Tax Free in Sapient");
	}
}

abstract class Branch2 extends Bank{

	@Override
	void cl() {
		// TODO Auto-generated method stub
		System.out.println("Car Loan");
	}
@Override
	void vl() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Loan");
	}
	void bpay(){
		System.out.println("Branch Pay is 10 lakhs");
	}
}

class Subbranch extends Branch2{
	void hl(){
		System.out.println("Home Loan");
	}
	void bgreet(){
		System.out.println("Welcome to Bank");
	}
}

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ref=new Branch1();
		ref.hl();
		ref.cl();
		ref.vl();
		ref.admin();
		Branch1 b=(Branch1)ref;
		b.bdetails();
		Branch2 b2= new Subbranch();
		b2.vl();
		b2.hl();
		b2.cl();
		b2.admin();
		b2.bpay();
		ref=new Subbranch();
		ref.cl();
		ref.hl();
		ref.vl();
		Subbranch x=new Subbranch();
		x.bgreet();
		
	}
	}
