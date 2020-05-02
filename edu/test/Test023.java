package com.edu.test;

import java.util.Scanner;

public class Test023 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = 0;
		for (int i = 1; i <= n; i++) {
			j += onenum(i);
		}
		System.out.println(j);
	}

	public static int onenum(int num) {
		String snum = Integer.toString(num);
		int i = 0;
		int j = 0;
		while (i < snum.length()) {
			if (snum.charAt(i) == '1') {
				j++;
			}
			i++;
		}
		return j;
	}

}
