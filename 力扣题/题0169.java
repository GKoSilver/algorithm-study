package 力扣题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 题0169 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0169 test = new 题0169();
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(test.majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		int max=0;
		int n = nums.length;
		Map<Integer, Integer> num_map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (num_map.get(i) == null) {
				num_map.put(i, 1);
			} else {
				num_map.put(i, num_map.get(i) + 1);
			}
		}
		Iterator iter = num_map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int key=(int) entry.getKey();
			int val = (int) entry.getValue();
			if(val>n/2) {
				max=key;
				break;
			}
		}

		return max;

	}

}
