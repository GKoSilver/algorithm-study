package com.edu.test;

public class Test009 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for (int i = 10; i < 100; i++) {
			String I=Integer.toString(i);
			int Ii=Integer.parseInt(I.charAt(0)+""+I.charAt(1)+""+I.charAt(1)+""+I.charAt(0)+"");
			System.out.println(Ii);
			
		}
	}

}
