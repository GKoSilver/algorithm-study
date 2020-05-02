package com.edu.test;

import java.util.Scanner;




/*
 * 存在问题，例如=100000时发生溢出，结果不正确，需要使用大数方法，修改后程序见Test1Fix
 */

public class Test001 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Mod10007(n));
	}

	private static Long Mod10007(int n) {
		// TODO 自动生成的方法存根
		if(n<=2) {
			return 1L;
		}
		n=n-2;
		Long n1 = 1L, n2 = 1L;
		Long n3 = 0L;
		int i = 0;
		while (i < n) {
			n3 = n1;
			n1 += n2;
			n2 = n3;
			i++;
		}
		return n1;

	}

}
