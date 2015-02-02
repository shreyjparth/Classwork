package com.Testing;
class Animal{
	void sound(){
		System.out.println("No sound");
	}
}
class Cat extends Dog{
	void sound(){
		System.out.println("Meow Meow Meow Meow Meow");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("Bhow Bhow Bhow Bhow Bhow");
	}
}

public class Test20 {

	public static void main(String[] args) {
		Animal a;
		a=new Cat();
		a.sound();
		Cat c=(Cat)a;
		c.sound();
		Dog d=(Dog)a;
		d.sound();
		

	}

}
