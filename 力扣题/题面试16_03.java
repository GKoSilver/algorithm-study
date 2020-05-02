package 力扣题;

public class 题面试16_03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试16_03 test = new 题面试16_03();
		int[] start1 = { 0, 0 }, end1 = { 1, 0 };
		int[] start2 = { 1, 1 }, end2 = { 0, -1 };
		System.out.println(test.intersection(start1, end1, start2, end2)[0] + ","
				+ test.intersection(start1, end1, start2, end2)[1]);
	}

	public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
		if((end1[0] - start1[0])==0) {
			
		}
		double k1 = (end1[1] - start1[1]) / (end1[0] - start1[0]);
		double k2 = (end2[1] - start2[1]) / (end2[0] - start2[0]);
		double b1 = start1[1] - start1[0] * k1;
		double b2 = start2[1] - start2[0] * k2;
		if (k1 == k2 && b1 == b2) {
			double x1 = Math.min(start1[0], end1[0]), x2 = Math.min(start2[0], end2[0]);
			if (x1 == x2) {
				double y = Math.min(Math.min(start1[1], end1[1]), Math.min(start2[1], end2[1]));
				double x = (y - b1) / k1;
				double[] index = { x, y };
				return index;
			} else {
				double x = Math.min(x1, x2);
				double y = k1 * x + b1;
				double[] index = { x, y };
				return index;
			}
		} else {
			double x = (b2 - b1) / (k1 - k2);
			double y = k1 * x + b1;
//			if (Math.round(x) == x) {
//				x = (int) x;
//			}
//			if (Math.round(y) == y) {
//				y = (int) y;
//			}
			if (x <= Math.max(start1[0], end1[0]) && x <= Math.max(start2[0], end2[0])
					&& x >= Math.min(start1[0], end1[0]) && x >= Math.min(start2[0], end2[0])) {
				double[] index = { x, y };
				return index;
			} else {
				double[] index = {};
				return index;
			}

		}
	}
}
