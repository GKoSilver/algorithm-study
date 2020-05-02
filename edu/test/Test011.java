package com.edu.test;

import java.util.Scanner;

public class Test011 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [][]yh=new int [n][n];
		yh[0][0]=1;
		int i=1;
		while (i<n) {
//			System.out.println("test"+i);
			yh[0][i]=0;
			i++;
		}
		for(int a=1;a<n;a++) {
			for(int b=0;b<n;b++) {
				if(b==0) {
					yh[a][b]=1;
				}
				else {
					yh[a][b]=yh[a-1][b]+yh[a-1][b-1];
				}
			}
		}
		for(int a=0;a<n;a++) {
			for(int b=0;b<=a;b++) {
				System.out.print(yh[a][b]+" ");
			}
			System.out.println();
		}
		
	}
}
