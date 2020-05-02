package com.edu.second2020;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		String psw = s.nextLine();
		s.close();
		String kspsw = "";
//		a=97,z=122
		for (int i = 0; i < psw.length(); i++) {
			int asc = psw.charAt(i);
//			System.out.println(asc);
			asc += 3;
			if (asc > 122)
				asc -= 26;
			kspsw += String.valueOf((char) asc);
		}
		System.out.println(kspsw);
	}

}
