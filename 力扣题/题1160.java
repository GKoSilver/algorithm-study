package 力扣题;

public class 题1160 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题1160 test = new 题1160();
		String[] words = { "hello", "world", "leetcode" };
		String chars = "welldonehoneyr";
		System.out.println(test.countCharacters(words, chars));
	}

	public int countCharacters(String[] words, String chars) {
		int word_lens = 0;
		for (int i = 0; i < words.length; i++) {
			boolean flag = true;
			StringBuffer residual_chars = new StringBuffer(chars);
			for (int j = 0; j < words[i].length(); j++) {
				int point = residual_chars.indexOf(String.valueOf(words[i].charAt(j)));
				if (point < 0) {
					flag = false;
					break;
				} else {
					residual_chars.deleteCharAt(point);
				}
			}
			if (flag) {
				word_lens += words[i].length();
			}
		}
		return word_lens;
	}

}
