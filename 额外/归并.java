package 额外;

import java.util.Arrays;

public class 归并 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = new int[a.length];
		sort(a, 0, a.length - 1, b);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a, int low, int high, int[] b) {
		if (low < high) {
			int min = (high + low) / 2;
			sort(a, low, min, b);
			sort(a, min + 1, high, b);
			merge(a, low, min, high, b);
		}
	}

	public static void merge(int[] a, int low, int min, int high, int[] b) {
		// TODO 自动生成的方法存根
		int low_p = low;
		int high_p = min + 1;
		int b_p = 0;
		while (low_p <= min && high_p <= high) {
			if (a[low_p] <= a[high_p]) {
				b[b_p] = a[low_p];
				low_p++;
				b_p++;
			} else {
				b[b_p] = a[high_p];
				high_p++;
				b_p++;
			}
		}
		while (high_p <= high) {
			b[b_p] = a[high_p];
			high_p++;
			b_p++;
		}
		while (low_p <= min) {
			b[b_p] = a[low_p];
			low_p++;
			b_p++;
		}
		b_p = 0;
		while (low <= high) {
			a[low] = b[b_p];
			low++;
			b_p++;
		}
	}

}
