package com.edu.test;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(sum(n));
	}

	private static Long sum(int n) {
		// TODO 自动生成的方法存根
		Long s;
		s=new Long((long)(n+1)*n/2);
		return s;
	}

}
