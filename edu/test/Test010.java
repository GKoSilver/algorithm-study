package com.edu.test;

public class Test010 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=100;i<1000;i++) {
			int a=i/100;
			int b=(i-100*a)/10;
			int c=i-100*a-10*b;
			int d=a*a*a+b*b*b+c*c*c;
			if(d==i) {
				System.out.println(d);
			}
		}
	}

}
