package com.edu.first2020;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=0;
		for(int i=1;i<=1200000;i++) {
			if(1200000%i==0) {
				n++;
			}
		}
		System.out.println(n);
	}

}
