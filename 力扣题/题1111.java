package 力扣题;

public class 题1111 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public int[] maxDepthAfterSplit(String seq) {
		int[] ans = new int[seq.length()];
		int idx = 0;
		for (char c : seq.toCharArray()) {
			ans[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
		}
		return ans;

	}

}
