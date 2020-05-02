package com.edu.second2020;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] dp = new int[1000][1000];
		for (int i = 1; i <= n; i++)
			dp[1][i] = 1;
		for (int i = 2; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 != 0) {
					int temp = 0;
					for (int k = 1; k <= j - 1; k++) {
						temp = (temp + dp[i - 1][k]) % 10000;
					}
					dp[i][j] = temp;
				} else {
					int temp = 0;
					for (int k = j + 1; k <= n; k++) {
						temp = (temp + dp[i - 1][k]) % 10000;
					}
					dp[i][j] = temp;
				}

			}
		}
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			ans += dp[m][i];
		}
		System.out.println(ans);
	}

}
