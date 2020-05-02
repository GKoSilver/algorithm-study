package com.edu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test004Fix {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner c = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<String>();
		String n = c.nextLine();
		String list = c.nextLine();
		String[] alist;
		alist = list.split(" ");
		for (String i : alist) {
			arr.add(i);
		}
		Collections.sort(arr);
		for (String j : arr) {
			System.out.print(j + " ");
		}
	}

}
