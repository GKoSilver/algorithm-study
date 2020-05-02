package com.edu.test;

import java.util.Scanner;

public class Test015 {
	static int a;
	static int b;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test015 m=new Test015();
		m.GetTwoInts();
		System.out.println(a+b);
	}
	private void GetTwoInts() {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		this.a=s.nextInt();
		this.b=s.nextInt();
		
	}

}
