package com.edu.second2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test09Copy {
	static class Node {
		int x;
		int y;
		int h;
	}

	public static void main(String[] args) {
		Node[] nodes = new Node[1002];
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			nodes[i] = new Node();
			nodes[i].x = s.nextInt();
			nodes[i].y = s.nextInt();
			nodes[i].h = s.nextInt();
		}
		s.close();
		double[][] map = new double[n + 2][n + 2];
		double[] mins = new double[n + 2];
		double MAX = 0x7f7f7f7f;
		for (int i = 0; i <= n + 1; i++) {
			for (int j = 0; j <= n + 1; j++) {

				map[i][j] = MAX;

			}
			mins[i] = MAX;
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				double x = (nodes[i].x - nodes[j].x) * (nodes[i].x - nodes[j].x);
				double y = (nodes[i].y - nodes[j].y) * (nodes[i].y - nodes[j].y);
				double h = (nodes[i].h - nodes[j].h) * (nodes[i].h - nodes[j].h);
				double temp = Math.sqrt(x + y) + h;
				map[i][j] = Math.min(map[i][j], temp);
				map[j][i] = map[i][j];
			}
		}
		boolean[] vis = new boolean[n + 2];
		mins[1] = 0;
		for (int i = 1; i < n; i++) {
			int tempX = 0;
			for (int j = 1; j <= n; j++) {
				if (!vis[j] && (tempX == 0 || mins[j] < mins[tempX])) {
					tempX = j;
				}
			}
			vis[tempX] = true;
			for (int j = 1; j <= n; j++) {
				if (!vis[j]) {
					mins[j] = Math.min(mins[j], map[tempX][j]);
				}
			}
		}
		double result = 0.0;
		for (int i = 2; i <= n; i++) {
			result += mins[i];
		}
		System.out.println(new DecimalFormat("#.00").format(result));
	}

}
