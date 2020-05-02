package 力扣题;

public class 题1071 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题1071 test = new 题1071();
		String str1 = "ABCABC";
		String str2 = "ABC";
//		str1 = "ABABAB";
//		str2 = "ABAB";
//		str1 = "LEET";
//		str2 = "CODE";
		System.out.println(test.gcdOfStrings(str1, str2));

	}

	public String gcdOfStrings(String str1, String str2) {
		for (int i = Math.min(str1.length(), str2.length()); i > 0; i--) {
			if (str1.length() % i == 0 && str2.length() % i == 0) {
				String common_factor = str1.substring(0, i);
				String new_str1 = "";
				String new_str2 = "";
				for (int a = 0; a < str1.length() / i; a++) {
					new_str1 += common_factor;
				}
				for (int b = 0; b < str2.length() / i; b++) {
					new_str2 += common_factor;
				}
				if (new_str1.equals(str1) && new_str2.equals(str2)) {
					return common_factor;
				}
			}
		}
		return "";

	}

}
