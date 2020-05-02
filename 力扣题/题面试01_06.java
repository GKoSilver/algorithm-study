package 力扣题;

public class 题面试01_06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试01_06 test = new 题面试01_06();
		String S = "aabcccccaaa";
		System.out.println(test.compressString(S));
	}

	public String compressString(String S) {
		if(S.length()==0) {
			return "";
		}
		int sum = 1;
		char key = S.charAt(0);
		String point_string = "";
		for (int i = 1; i < S.length(); i++) {
			if (key == S.charAt(i)) {
				sum++;
			} else {
				point_string += String.valueOf(key) + String.valueOf(sum);
				key = S.charAt(i);
				sum = 1;
			}
		}
		point_string += String.valueOf(key) + String.valueOf(sum);
		return point_string.length() < S.length() ? point_string : S;
	}
}
