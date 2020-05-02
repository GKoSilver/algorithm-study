package com.edu.second2020;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int[][] matrix = new int[n][m];
		int temp = 1;
		int upBound = 0;
		int rightBound = m - 1;
		int leftBound = 0;
		int downBound = n - 1;
		while (true) {
			for (int i = leftBound; i <= rightBound; ++i)
				matrix[upBound][i] = temp++;
			if (++upBound > downBound)
				break;
			for (int i = upBound; i <= downBound; ++i)
				matrix[i][rightBound] = temp++;
			if (--rightBound < leftBound)
				break;
			for (int i = rightBound; i >= leftBound; --i)
				matrix[downBound][i] = temp++;
			if (--downBound < upBound)
				break;
			for (int i = downBound; i >= upBound; --i)
				matrix[i][leftBound] = temp++;
			if (++leftBound > rightBound)
				break;
		}
		System.out.println(matrix[r - 1][c - 1]);
	}
}
