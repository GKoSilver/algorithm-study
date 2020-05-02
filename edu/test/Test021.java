package com.edu.test;

import java.util.Scanner;

public class Test021 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s=new Scanner(System.in);
		int L=s.nextInt();
		int R=s.nextInt();
		if(L==R)
			System.out.println(onenum(R));
		else {
			int sum=0;
			for(int i=L;i<=R;i++) {
				sum+=onenum(i);
			}
			System.out.println(sum);
		}
	}
	public static int onenum(int t) {
		String b=Integer.toBinaryString(t);
		int sum=0;
		int i=0;
		while(i<b.length()) {
			if(b.charAt(i)=='1') {
				sum++;
			}
			i++;
		}
		return sum;
	}

}
