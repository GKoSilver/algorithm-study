package com.edu.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test005 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int i = 0;
		ArrayList<String> list = new ArrayList<String>();
		while (i < n) {
			Scanner cc = new Scanner(System.in);
			String j = XtoO(cc.nextLine());
			if (j.charAt(0) == '0') {
				j = j.substring(1, j.length());

			}
			list.add(j);
			i++;
		}
		for (String k : list) {
			System.out.println(k);
		}

	}

	private static String XtoO(String ox) {
		ArrayList<Character> arr = new ArrayList<Character>();
		int p1 = 0;
		String target1 = "";
		while (p1 < ox.length()) {
			arr.add(ox.charAt(p1));
			p1++;
		}
		for (char i : arr) {
			target1 += transform1(i);
		}
//		System.out.println(target1);
		if (target1.length() % 3 == 1) {
			target1 = "00" + target1;
		} else if (target1.length() % 3 == 2) {
			target1 = "0" + target1;
		}
		int p2 = 0;
		String target2 = "";
		while (p2 < target1.length() - 2) {
			String transit = target1.charAt(p2) + "" + target1.charAt(p2 + 1) + "" + target1.charAt(p2 + 2) + "";
			target2 += transform2(transit);
			p2 += 3;
//			System.out.print(transit+"/");
		}
//		System.out.println(target2);

		return target2;

	}

	private static String transform2(String transit) {
		// TODO 自动生成的方法存根
		String t = "0";
		switch (transit) {
		case "000":
			t = "0";
			break;
		case "001":
			t = "1";
			break;
		case "010":
			t = "2";
			break;
		case "011":
			t = "3";
			break;
		case "100":
			t = "4";
			break;
		case "101":
			t = "5";
			break;
		case "110":
			t = "6";
			break;
		case "111":
			t = "7";
			break;
		default:
			break;
		}

		return t;
	}

	public static String transform1(char j) {
		String t = "0000";
		switch (j) {
		case '0':
			t = "0000";
			break;
		case '1':
			t = "0001";
			break;
		case '2':
			t = "0010";
			break;
		case '3':
			t = "0011";
			break;
		case '4':
			t = "0100";
			break;
		case '5':
			t = "0101";
			break;
		case '6':
			t = "0110";
			break;
		case '7':
			t = "0111";
			break;
		case '8':
			t = "1000";
			break;
		case '9':
			t = "1001";
			break;
		case 'A':
			t = "1010";
			break;
		case 'B':
			t = "1011";
			break;
		case 'C':
			t = "1100";
			break;
		case 'D':
			t = "1101";
			break;
		case 'E':
			t = "1110";
			break;
		case 'F':
			t = "1111";
			break;
		default:
			break;
		}
		return t;
	}

}
