package com.edu.test;

import java.util.Scanner;

public class Test013 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int max;
		int min;
		int sum;
		int n1 = s.nextInt();
		max = n1;
		min = n1;
		sum = n1;
		if (n > 1) {
			while (i < n - 1) {
				int n2 = s.nextInt();
				max = Math.max(max, n2);
				min = Math.min(min, n2);
				sum += n2;
				i++;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
