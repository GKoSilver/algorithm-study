package 力扣题;

public class 题0836 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0])
				&& Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1])) {
			return true;
		} else {
			return false;
		}
	}

}
