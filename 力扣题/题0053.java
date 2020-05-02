package 力扣题;

public class 题0053 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0053 fiftythree= new 题0053();
		int []nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(fiftythree.maxSubArray(nums));
	}
	public int maxSubArray(int[] nums) {
		int Max=nums[0];
		int max=0;
		int len=nums.length;
		int listlen=1;
		for(listlen=1;listlen<=len;listlen++) {
			for(int i=0;i<=len-listlen;i++) {
				for(int j=i,k=0;k<listlen;j++,k++) {
					max+=nums[j];
				}
				if(max>Max) {
					Max=max;
				}
				max=0;
			}
		}

		return Max;
	}

}
