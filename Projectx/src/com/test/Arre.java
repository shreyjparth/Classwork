package com.test;

public class Arre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gg[]=new int[args.length];
		for( int i=0;i<args.length;i++){
			gg[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<gg.length;i++){
			System.out.println(" "+gg[i]);
		}
		
}
}