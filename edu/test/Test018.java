package com.edu.test;
/* 
 * 基础练习 字母图形  
 * 问题描述
利用字母可以组成一些美丽的图形，下面给出了一个例子：

ABCDEFG

BABCDEF

CBABCDE

DCBABCD

EDCBABC

这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。

输入格式
输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
输出格式
输出n行，每个m个字符，为你的图形。
样例输入
5 7
样例输出
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
数据规模与约定
1 <= n, m <= 26。
 */

import java.util.Scanner;

public class Test018 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int m=c.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=i;k>0;k--) {
				System.out.print(alpha.charAt(k));
			}
			for(int j=0;j<m-i;j++) {
				System.out.print(alpha.charAt(j));
				
			}
			System.out.println();
		}
		
	}

}
