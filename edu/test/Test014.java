package com.edu.test;

import java.util.Scanner;

public class Test014 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int []p=swap(a, b);
		System.out.println(p[0]+" "+p[1]);
	}

	private static int[] swap(int a, int b) {
		// TODO 自动生成的方法存根
		int []t= {b,a};
		return t;
	}

}
