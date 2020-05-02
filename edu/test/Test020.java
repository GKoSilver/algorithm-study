package com.edu.test;

import java.util.Scanner;

public class Test020 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%100!=0&&n%4==0) {
			System.out.println("yes");
		}
		else if(n%400==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
