package 力扣题;

import java.util.ArrayList;

public class 题0460 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		LFUCache cache = new LFUCache(2 /* capacity (缓存容量) */ );
//
//		cache.put(1, 1);
//		cache.put(2, 2);
//		System.out.println(cache.get(1));// 返回 1
//		cache.put(3, 3); // 去除 key 2
//		System.out.println(cache.get(2));// 返回 -1 (未找到key 2)
//		System.out.println(cache.get(3));// 返回 3
//		cache.put(4, 4); // 去除 key 1
//		System.out.println(cache.get(1));// 返回 -1 (未找到 key 1)
//		System.out.println(cache.get(3));// 返回 3
//		System.out.println(cache.get(4));// 返回 4

		LFUCache cache = new LFUCache(3);
		cache.put(2, 2);
		cache.put(1, 1);
		System.out.println(cache.get(2));
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		cache.put(3, 3);
		cache.put(4, 4);
		System.out.println(cache.get(3));
		System.out.println(cache.get(2));
		System.out.println(cache.get(1));
		System.out.println(cache.get(4));
	}

}

class LFUCache {
	public int capacity;
	ArrayList<ArrayList<Integer>> cache = new ArrayList<ArrayList<Integer>>();

	public LFUCache(int capacity) {
		this.capacity = capacity;
//		Integer
	}

	public int get(int key) {
		boolean got = false;
		int index = 0;
		for (ArrayList<Integer> p : cache) {

			if (p.get(0) == key) {
				got = true;
				break;
			}
			index++;
		}
		if (got) {
			int value = cache.get(index).get(1);
			ArrayList<Integer> refresh = new ArrayList<Integer>();
			refresh.add(key);
			refresh.add(value);
			cache.remove(index);
			cache.add(refresh);
			return value;
		} else {
			return -1;
		}

	}

	public void put(int key, int value) {
		if (cache.size() == capacity) {
			cache.remove(0);
		}
		ArrayList<Integer> refresh = new ArrayList<Integer>();
		refresh.add(key);
		refresh.add(value);
		cache.add(refresh);

	}
}
