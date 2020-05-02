package com.edu.first2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n < 10) {
			System.out.println(n);
		} else {
			int sum = 9;
			for (int i = n; i > 1; i--) {
				boolean flag = true;
				String num = Integer.toString(i);
				ArrayList<Integer> arrNum = new ArrayList<Integer>();
				for (int j = 0; j < num.length(); j++) {
					arrNum.add(num.charAt(j) - '0');
				}
				if (num.length() > 1) {
					for (int k = 0; k < num.length() - 1; k++) {
						if (arrNum.get(k) > arrNum.get(k + 1)) {
							flag = false;
							break;
						}
					}
					if (flag) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}

}
