package 力扣题;

import java.util.ArrayList;
import java.util.Collections;

public class 题0242 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0242 test = new 题0242();
		String s = "rat", t = "car";
		System.out.println(test.isAnagram(s, t));

	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		ArrayList<String> ss = new ArrayList<String>();
		ArrayList<String> tt = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			ss.add(String.valueOf(s.charAt(i)));
			tt.add(String.valueOf(t.charAt(i)));
		}
		Collections.sort(ss);
		Collections.sort(tt);
		for (int j = 0; j < ss.size(); j++) {
			if (!ss.get(j).equals(tt.get(j))) {
				return false;
			}
		}
		return true;

	}

}
