package com.inheritance;
import java.util.*;

class Shape{
	int x,y;
	
	Shape(){
	}
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void area(int x,int y){
				}
	}

class Rect extends Shape{
	int area;
	void area(int x,int y){
		
		area=x*y;
		System.out.println(area);
	}
}

class Tri extends Shape{
	float area;
	void area(int x,int y){
	area=(float)0.5*x*y;
	System.out.println(area);
	}
}

class Test4{
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		System.out.println("1.Rectangle");
		System.out.println("2.Triangle");
		ch=sc.nextInt();
		if(ch==1){
			int a,b;
			Shape s=new Rect();
			a=sc.nextInt();
			b=sc.nextInt();
			s.area(a, b);
		} 
		else if(ch==2){
			int b,h;
			Shape s=new Tri();
			b=sc.nextInt();
			h=sc.nextInt();
			s.area(b, h);
				
		}
		sc.close();
	}
}
