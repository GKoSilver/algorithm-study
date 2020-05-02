package 力扣题;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class 题0945 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] A = { 1, 2, 2 };
		题0945 test = new 题0945();
		System.out.println(test.minIncrementForUnique(A));
	}

	public int minIncrementForUnique(int[] A) {
		if(A.length==0){
            return 0;
        }
		int num = 0;
		Arrays.sort(A);
		Map<Integer, Integer> a_map = new ConcurrentHashMap<Integer, Integer>();
		for (int i : A) {
			if (a_map.get(i) == null) {
				a_map.put(i, 1);
			} else {
				a_map.put(i, a_map.get(i) + 1);
			}

		}

		int max_key = A[A.length - 1];
		for (int key = 0; key < max_key; key++) {
			if (a_map.get(key) == null) {
				continue;
			}
			if (a_map.get(key) > 1) {
				num += a_map.get(key) - 1;
				if (a_map.get(key + 1) == null) {
					a_map.put(key + 1, a_map.get(key) - 1);
				} else {
					a_map.put(key + 1, a_map.get(key + 1) + a_map.get(key) - 1);
				}
				a_map.put(key, 1);
			}
		}
		if (a_map.get(max_key) > 1) {
			num += a_map.get(max_key) * (a_map.get(max_key) - 1) / 2;
		}

		return num;

	}

}
