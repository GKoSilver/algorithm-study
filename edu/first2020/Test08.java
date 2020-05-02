package com.edu.first2020;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n;
		int count = 0;
		n = c.nextInt();
		int[][] map = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			map[i][i] = 1;
			map[i][0] = 1;
			map[0][i] = 1;
		}
		for (int i = 1; i <= n; i++) {
			count += f(n, i, map);
			count %= 10000;
		}
		System.out.println(count);

	}

	public static int f(int x, int y, int[][] map) {
		if (map[x][y] != 0) {
			return map[x][y];
		}
		for (int i = Math.abs(x - y) - 1; i >= 0; i--) {
			map[x][y] += f(y, i, map);
		}
		map[x][y] %= 10000;
		map[y][x] = map[x][y];
		return map[x][y];
	}

}
