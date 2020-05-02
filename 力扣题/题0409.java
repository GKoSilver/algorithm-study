package 力扣题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 题0409 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0409 test = new 题0409();
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
//		System.out.println(s.length());
		System.out.println(test.longestPalindrome(s));
	}

	public int longestPalindrome(String s) {
		int odd = 0;
		int even = 0;
		boolean flag = false;
		Map<String, Integer> alphabet = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (alphabet.containsKey(String.valueOf(s.charAt(i)))) {
				alphabet.put(String.valueOf(s.charAt(i)), alphabet.get(String.valueOf(s.charAt(i))) + 1);
			} else {
				alphabet.put(String.valueOf(s.charAt(i)), 1);
			}
		}
		Iterator iter = alphabet.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int val = (int) entry.getValue();
			if (val % 2 == 0) {
				even += val;
			} else if (val >= 1) {
				flag = true;
				odd += val - 1;
			}
		}
		if (flag) {
			odd++;
		}
		return even + odd;

	}

}
