package 力扣题;

import java.util.ArrayList;

public class 题面试57_02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试57_02 test = new 题面试57_02();
		int target = 9;
		int[][] target_combination = test.findContinuousSequence(target);
		for (int[] i : target_combination) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public int[][] findContinuousSequence(int target) {
		ArrayList<ArrayList<Integer>> all_combination = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i < target; i++) {
			double n = (1 - i * 2 + Math.sqrt(4 * Math.pow(i, 2) - i * 4 + target * 8 + 1)) / 2;
			String[] n_part = String.valueOf(n).split("\\.");
			if (n_part[1].equals("0")) {
				ArrayList<Integer> now_combination = new ArrayList<Integer>();
				for (int j = 0; j < Integer.valueOf(n_part[0]); j++) {
					now_combination.add(i + j);
				}
				all_combination.add(now_combination);
			}
		}
		int[][] target_combination = new int[all_combination.size()][];
		for (int i = 0; i < all_combination.size(); i++) {
			target_combination[i] = new int[all_combination.get(i).size()];
			for (int j = 0; j < all_combination.get(i).size(); j++) {
				target_combination[i][j] = all_combination.get(i).get(j);
			}
		}
		return target_combination;
	}
}
