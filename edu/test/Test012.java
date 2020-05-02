package com.edu.test;

import java.util.Scanner;

public class Test012 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		String str = "";
		while (i < n) {
			str += s.next();
			i++;
		}

		String j = s.next();
		if (str.indexOf(j) == -1) {
			System.out.println(str.indexOf(j));
		} else {
			System.out.println(str.indexOf(j) + 1);
		}

	}

}
