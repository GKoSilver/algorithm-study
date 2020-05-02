package com.edu.test;
/*
 * 基础练习 01字串  
 * 问题描述
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：

00000

00001

00010

00011

00100

请按从小到大的顺序输出这32种01串。

输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
00000
00001
00010
00011
<以下部分省略>
 */

import java.text.DecimalFormat;

public class Test019 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=0;
		DecimalFormat df = new DecimalFormat("00000");
		while(i<32) {
			System.out.println(df.format(Integer.valueOf(Integer.toBinaryString(i))));
			i++;
		}
		
	}

}
