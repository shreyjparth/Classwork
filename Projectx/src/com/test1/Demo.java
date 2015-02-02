package com.test1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
        int[][] marks=new int[3][3];
        for(int i=0;i<marks.length;i++){
        	for(int j=0;j<marks[i].length;j++){
        		marks[i][j]=Integer.parseInt(args[0]);
        		k++;
        	}
        }
        for (int[] v : marks) {
            for (int a : v) {
                System.out.println(a);
            }
        }
	}

}
