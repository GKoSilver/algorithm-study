package 力扣题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class 题0229 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public List<Integer> majorityElement(int[] nums) {
		Map<Integer, Integer> num_map = new HashMap<Integer, Integer>();
		int n = nums.length / 3;
		for (int i : nums) {
			if (num_map.get(i) == null) {
				num_map.put(i, 1);
			} else {
				num_map.put(i, num_map.get(i) + 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		Iterator iter = num_map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int val = (int) entry.getValue();
			if (val > n) {
				list.add((Integer) entry.getKey());
			}
		}
		return list;

	}

}
