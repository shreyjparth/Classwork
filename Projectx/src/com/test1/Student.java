package com.test1;

class Student {

	String name;
	int m1,m2,m3;
	Student(){
		System.out.println("Hello");		
	};
	String Checkgrade(){
		m3=(m1+m2)/2;
		String s;
		if(m3>60){
			s="A Grade";
		}
			else{
				s="B Grade";			
			}
		return s;
			
		}
	}
