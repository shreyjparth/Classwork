package com.Exceptions;

public class Car {
	int price;
	String name;
	Car(){
	
	}
	public Car(int price, String name) {
	super();
	this.price = price;
	this.name = name;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a=new Car(1000000,"FORD GT");
		
		System.out.println(a);
		

	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + "]";
	}

}
