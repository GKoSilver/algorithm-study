package com.edu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test004 {

	/*
	 * 看错了题目要求，修改结果见Test4Fix
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		String n = c1.nextLine();
		String list = c2.nextLine();
		String[] alist;
		alist = list.split(" ");
		for (String i : alist) {
			arr.add(i);
		}
		arr.add(n);
		Collections.sort(arr);
		for (String j : arr) {
			System.out.print(j + " ");
		}
	}

}
