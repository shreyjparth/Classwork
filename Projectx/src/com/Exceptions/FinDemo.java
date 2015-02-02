package com.Exceptions;
import java.util.*;
public class FinDemo { // CLOSABLE 
// AUTOCLOASBLE INTERFACE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
			String name=sc.next();
			int salary=sc.nextInt();
			System.out.println(name);
			System.out.println(salary);
		}
		
	}

}
