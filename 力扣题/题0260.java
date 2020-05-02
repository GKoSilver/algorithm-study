package 力扣题;

import java.util.ArrayList;

public class 题0260 {
	public static void main(String[] args) {
		题0260 test=new 题0260();
		int[] nums= {1,2,1,3,2,5};
		int []result=test.singleNumber(nums);
		for(int i:result) {
			System.out.println(i);
		}
	}

	public int[] singleNumber(int[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			if (!list.remove(new Integer(i))) {
				list.add(i);
			}
		}
		int[] result = list.stream().mapToInt(Integer::intValue).toArray();

		return result;

	}
}
