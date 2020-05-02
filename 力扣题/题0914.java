package 力扣题;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class 题0914 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0914 test = new 题0914();
		int[] deck = { 1, 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(test.hasGroupsSizeX(deck));
	}

	public boolean hasGroupsSizeX(int[] deck) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Arrays.sort(deck);
		int deck_item = deck[0];
		int item_num = 0;
		for (int i : deck) {
			if (i == deck_item) {
				item_num++;
			} else if (item_num > 1) {
				num.add(item_num);
				deck_item = i;
				item_num = 1;
			} else {
				return false;
			}
		}
		num.add(item_num);
		int a = num.get(0);
		for (int i : num) {
			a = BigInteger.valueOf(a).gcd(BigInteger.valueOf(i)).intValue();
			if (a == 1) {
				return false;
			}
		}
		return true;

	}

}
