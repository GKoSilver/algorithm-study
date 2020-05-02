package com.edu.test;
/*
 * 问题描述
　　模拟程序型计算器，依次输入指令，可能包含的指令有


　　1. 数字：'NUM X'，X为一个只包含大写字母和数字的字符串，表示一个当前进制的数
　　2. 运算指令：'ADD','SUB','MUL','DIV','MOD'，分别表示加减乘，除法取商，除法取余
　　3. 进制转换指令：'CHANGE K'，将当前进制转换为K进制(2≤K≤36)
　　4. 输出指令：'EQUAL'，以当前进制输出结果
　　5. 重置指令：'CLEAR'，清除当前数字


　　指令按照以下规则给出：
　　数字，运算指令不会连续给出，进制转换指令，输出指令，重置指令有可能连续给出
　　运算指令后出现的第一个数字，表示参与运算的数字。且在该运算指令和该数字中间不会出现运算指令和输出指令
　　重置指令后出现的第一个数字，表示基础值。且在重置指令和第一个数字中间不会出现运算指令和输出指令
　　进制转换指令可能出现在任何地方


　　运算过程中中间变量均为非负整数，且小于2^63。
　　以大写的'A'~'Z'表示10~35
输入格式
　　第1行：1个n，表示指令数量
　　第2..n+1行：每行给出一条指令。指令序列一定以'CLEAR'作为开始，并且满足指令规则
输出格式
　　依次给出每一次'EQUAL'得到的结果
样例输入
7
CLEAR
NUM 1024
CHANGE 2
ADD
NUM 100000
CHANGE 8
EQUAL
样例输出
2040
 */

import java.util.Scanner;

public class Test017 {
	static String dict = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		int n = s.nextInt();
//		System.out.println(TtoN(t, n));//十进制转换成N进制
		System.out.println(NtoT(t, n));//N进制转换成十进制

	}

	public static String TtoN(String T, int n) {//十进制转换成N进制
		Long l=Long.valueOf(T).longValue();
		String N = "";
		while (true) {
			Long d = l % n;
			N += dict.charAt(new Long(d).intValue());
			l = l / n;
			if (l == 0) {
				N = new StringBuffer(N).reverse().toString();
				break;
			}
		}
		return N;

	}

	public static String NtoT(String N,int n) {//N进制转换成十进制
		N = new StringBuffer(N).reverse().toString();
		int i=0;
		Long t=new Long(0);
		while(i<N.length()) {
			int a=dict.indexOf(N.charAt(i));
//			System.out.println(N.charAt(i));
			Long b= (long) Math.pow(n, i);
//			System.out.println(a+"/"+b);
			t+=a*b;
			i++;
		}
		return Long.toString(t);

	}
}
