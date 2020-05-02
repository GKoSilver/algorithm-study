package com.edu.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test022 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if (t < 0) {
			System.out.println(0);
		} else {
			DecimalFormat df = new DecimalFormat("#");
			System.out.println(df.format(Math.pow(Math.ceil((Math.sqrt(t))), 2)));
		}
	}

}
