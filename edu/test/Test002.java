package com.edu.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test002 {
	final static double pi=Math.PI;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		System.out.println(pi);
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		DecimalFormat df = new DecimalFormat("0.0000000");
		System.out.println(df.format(Area(n)));
	}
	private static double Area(int n) {
		// TODO 自动生成的方法存根
		double area;
		area=pi*Math.pow(n, 2);
		return area;
	}

}
