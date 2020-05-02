package 力扣题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 题0167 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0167 test = new 题0167();
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(test.twoSum(numbers, target));

	}

	public int[] twoSum(int[] numbers, int target) {
		ArrayList<Integer> anumbers = new ArrayList<Integer>(
				Arrays.stream(numbers).boxed().collect(Collectors.toList()));
		Collections.sort(anumbers);
		boolean flag = false;
		ArrayList<Integer> sumindex = new ArrayList<Integer>();
		for (int i = 0; i < anumbers.size(); i++) {

			int sum = 0;
			for (int j = i; j < anumbers.size(); j++) {
				sum += anumbers.get(j);
				sumindex.add(j + 1);
				if (sum > target) {
					break;
				} else if (sum == target) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			} else {
				sumindex.clear();
			}
		}
		int[] tarnum = new int[sumindex.size()];
		for (int i = 0; i < sumindex.size(); i++) {
			tarnum[i] = sumindex.get(i);
		}
		return tarnum;

	}

}
