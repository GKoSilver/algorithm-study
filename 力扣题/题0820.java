package 力扣题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 题0820 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0820 test = new 题0820();
		String[] words = { "time", "me", "bell" };
		System.out.println(test.minimumLengthEncoding(words));
	}

	public int minimumLengthEncoding(String[] words) {
		int min_len = 0;
		Set<String> list = new HashSet<String>(Arrays.asList(words));
		for (String str : words) {
			for (int i = 1; i < str.length(); i++) {
				list.remove(str.substring(i));
			}
		}

		for (String str : list) {
			min_len += str.length() + 1;
		}
		return min_len;

	}

}
