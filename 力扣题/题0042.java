package 力扣题;

public class 题0042 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0042 test = new 题0042();
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(test.trap(height));

	}

	public int trap(int[] height) {
		int water = 0;
		for (int i = 0; i < height.length - 1; i++) {
			int block = 0;
			if (height[i] > 0) {
				for (int j = i + 1; j < height.length; j++) {
					if (j == height.length - 1 && height[i] > height[j]) {
						height[i]--;
						i--;
						block = 0;
						break;
					}
					if (height[j] >= height[i]) {
						water += height[i] * (j - i - 1);
						i = j - 1;
						break;
					} else {
						block += height[j];
					}
				}
				water -= block;
			}
		}
		return water;
	}

}
