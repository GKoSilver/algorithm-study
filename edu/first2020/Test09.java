package com.edu.first2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		ArrayList<String> haveGrass=new ArrayList<String>();
		String[][] Lawn = new String[n][m];
		for (int i = 0; i < n; i++) {
			String lawnRow = s.next();
			for (int j = 0; j < m; j++) {
				Lawn[i][j] = String.valueOf(lawnRow.charAt(j));
			}
		}
		int mounth = s.nextInt();
		for (int k = 0; k < mounth; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (Lawn[i][j].equals("g")) {
						haveGrass.add(i+"/"+j);
					}
				}
			}
			for(String grasses:haveGrass) {
				String []num=grasses.split("/");
				int a=Integer.parseInt(num[0]);
				int b=Integer.parseInt(num[1]);
				try {
					Lawn[a-1][b]="g";
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					Lawn[a+1][b]="g";
				} catch (Exception e) {
					// TODO: handle exception
				}						try {
					Lawn[a][b-1]="g";
				} catch (Exception e) {
					// TODO: handle exception
				}						try {
					Lawn[a][b+1]="g";
				} catch (Exception e) {
					// TODO: handle exception
				}
			}			
		}

		for (String[] i : Lawn) {
			for (String j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
