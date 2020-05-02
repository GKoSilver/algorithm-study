package com.edu.first2020;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		if (n < 3) {
			System.out.println(0);
		} else {
			for (int j = 1; j < n - 1; j++) {
				boolean a_flag = false;
				boolean b_flag = false;
				for (int a = 0; a < j; a++) {
					if (num[a] < num[j]) {
						a_flag = true;
						break;
					}
				}
				for (int b = 0; b < n; b++) {
					if (num[b] > num[j]) {
						b_flag = true;
						break;
					}
				}
				if (a_flag && b_flag) {
					sum++;
				}
			}
			System.out.println(sum);
		}

	}

}
