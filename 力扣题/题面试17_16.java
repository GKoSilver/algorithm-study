package 力扣题;

public class 题面试17_16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试17_16 test=new 题面试17_16();
		int[] nums= {2,1,4,5,3,1,1,3};
		System.out.println(test.massage(nums));

	}
    public int massage(int[] nums) {
        int n = (int)nums.length;
        if (n==0) return 0;
        int dp0 = 0, dp1 = nums[0];

        for (int i = 1; i < n; ++i){
            int tdp0 = Math.max(dp0, dp1); 
            int tdp1 = dp0 + nums[i]; 

            dp0 = tdp0; 
            dp1 = tdp1; 
        }
        return Math.max(dp0, dp1);

    }

}
