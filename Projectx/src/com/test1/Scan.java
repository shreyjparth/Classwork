package com.test1;
import java.util.*;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
System.out.println("Neter name");
Scanner sc=new Scanner(System.in);
String name=sc.next();
System.out.println("Number");
int no=sc.nextInt();
System.out.println(name);
System.out.println(no);
sc.nextLine();

System.out.println("Dpeartment");
sc.next();
String dept=sc.nextLine();
System.out.println(dept);
System.out.println("Salary");
float sal=sc.nextFloat();
System.out.println(sal);
sc.close();
	}

}
