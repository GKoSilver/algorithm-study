package com.edu.test;

import java.util.Scanner;

public class Test024 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int sum=0;
		int n = s.nextInt();
		int m = s.nextInt();
		String []stu=new String[n];
		for(int i=0;i<n;i++) {	
			stu[i]=s.nextLine();
		}
		for(int j=0;j<n;j++) {
			String stus=stu[j];
			stus=stus.replace('1', 'a');
			stus=stus.replace('0', 'b');
			stus=stus.replace('a', '0');
			stus=stus.replace('b', '1');
			for(int k=j;k<n;k++) {
				if(stus.equals(stu[k])) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		s.close();
	}

}
