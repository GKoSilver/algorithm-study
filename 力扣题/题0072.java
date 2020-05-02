package 力扣题;

public class 题0072 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0072 test = new 题0072();
		String word1 = "horse";
		String word2 = "ros";
		System.out.println(test.minDistance(word1, word2));
	}

	public int minDistance(String word1, String word2) {
		int w1_p = 0;
		int w2_p = 0;
		int repeat = 0;
		while (w1_p < word1.length() && w2_p < word2.length()) {
			if (word1.charAt(w1_p) == word2.charAt(w2_p)) {
				w1_p++;
				repeat++;
			} else {
				w2_p++;
			}
		}
		return Math.max(word1.length(), word2.length()) - repeat;

	}

}
