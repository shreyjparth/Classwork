package com.test1;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Student a=new Student();
		Student b=new Student();
		
		Scanner s=new Scanner(System.in);
		
		a.name=s.nextLine();
		a.m1=s.nextInt();
		a.m2=s.nextInt();
		String v=a.Checkgrade();
		System.out.println(v);
		s.nextLine();
		b.name=s.nextLine();
		b.m1=s.nextInt();
		b.m2=s.nextInt();
		String z=b.Checkgrade();
		System.out.println(z);
		s.close();
	}

}
