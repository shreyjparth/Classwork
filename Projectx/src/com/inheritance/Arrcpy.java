package com.inheritance;

public class Arrcpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={100,200,300,400,500,600};
		int carr[]=new int[10];
		System.arraycopy(arr, 3, carr, 5, 10);

		for(int v:carr){
			System.out.println(v);
		}
	}

}
 