package 力扣题;

import java.util.ArrayList;

public class 题面试62_00 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试62_00 test = new 题面试62_00();
		int n = 5;
		int m = 3;
		System.out.println(test.lastRemaining(n, m));

	}

	public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
	}

}
