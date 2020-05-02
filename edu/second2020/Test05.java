package com.edu.second2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (!(i % a == 0 || i % b == 0 || i % c == 0)) {
				numlist.add(i);
			}
		}
		System.out.println(numlist.size());
	}

}
