package com.interfaces;
abstract class Vehicle{
	String Name,Model;
	int price;
	Vehicle(){
		
	}
	Vehicle(String s,String x,int a){
		Name=s;
		Model=x;
		price=a;
	}
	abstract void getDetails();
	abstract void getMileage(String s);
	
}
interface insurance{
	void getInsurance();
}

interface Access{
	void extaccess();
}

interface Fwaccess extends Access{
	void intaccess();
}
class Car extends Vehicle implements insurance,Fwaccess{
	Car(){
		
	}
	Car(String s,String d,int x){
		Name=s;
		Model=d;
		price=x;		
	}
	public void getDetails(){
		System.out.println("The deatils of the vehicle are:");
		System.out.println("Name:"+" "+Name+" "+"Model:"+" "+Model+" "+"Price:"+" "+price+" ");
	}
	public void getMileage(String s){
		System.out.println("The mileage of"+s+"is"+100);
	}
	public void getInsurance(){
		System.out.println("Insurance of car done!");
	}
	public void extaccess(){
		System.out.println("External access fit!");
	}
	public void intaccess(){
		System.out.println("Internal access done!");
	}
	
}

class Bike extends Vehicle implements insurance,Access{
	Bike(){
		
	}
	Bike(String s,String x,int d){
		Name=s;
		Model=x;
		price=d;
	}
	public void getDetails(){
		System.out.println("The deatils of the vehicle are:");
		System.out.println("Name:"+" "+Name+" "+"Model:"+" "+Model+" "+"Price:"+" "+price+" ");
	}
	public void getMileage(String s){
		System.out.println("The mileage of"+s+"is"+200);
	}
	public void getInsurance(){
		System.out.println("Insurance of Bike done!");
	}
	public void extaccess(){
		System.out.println("External access are fit!");
	}
}
public class Vehicleshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Car("MARUTI","X",1000000);
		v.getDetails();
		v.getMileage("Benz");
		Car c=(Car)v;
		insurance in=c;
		in.getInsurance();
		Access ext=c;
		ext.extaccess();
		Fwaccess f=c;
		f.intaccess();
		
		Vehicle v1=new Bike("HONDA","XXX",10000);
		v1.getDetails();
		v1.getMileage("Honda");
		Bike b=(Bike)v1;
		insurance inb=b;
		inb.getInsurance();
		Access extb=b;
		extb.extaccess();		
	}

}
