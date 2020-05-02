package 力扣题;

public class 题0121 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] priecs = { 7, 1, 5, 3, 6, 4 };
		题0121 test = new 题0121();

		System.out.println(test.maxProfit(priecs));
	}

	public int maxProfit(int[] prices) {
		int Max_Price = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int Buy_Price = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				int Sold_Price = prices[j];
				int Now_Price = Sold_Price - Buy_Price;
				if (Max_Price < Now_Price) {
					Max_Price = Now_Price;
				}
			}
		}
		return Max_Price;
	}
}
