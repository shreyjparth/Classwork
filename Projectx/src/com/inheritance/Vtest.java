package com.inheritance;

class Vehicle{
	String name;
	int price;
	public Vehicle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	void getDetail(){
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
	}
	void mile(){
		
	}
}

class Car extends Vehicle{
	
	public Car(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void mile() {
		// TODO Auto-generated method stub
		super.mile();
		System.out.println("Mileage for Car is 100");
	}
	
class Bike extends Vehicle{

	public Bike(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void mile() {
		// TODO Auto-generated method stub
		super.mile();
		System.out.println("Mileage for Bike is 200");
	}
	
	
}
}
public class Vtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v=new Car();
		//Veh
	}

}
