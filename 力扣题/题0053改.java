package 力扣题;

public class 题0053改 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0053改 fiftythree= new 题0053改();
		int []nums= {-2,-3,-1};
		System.out.println(fiftythree.maxSubArray(nums));
	}
	public int maxSubArray(int[] nums) {
		int max=0;
		int top=0;
		int len=nums.length;
		int keynum=len;
		boolean ok=true;
		if(len==1){
			return nums[0];
		}
		if(len==2) {
			if(nums[0]>=0&&nums[1]>=0)
				return nums[0]+nums[1];
			if(nums[0]<nums[1])
				return nums[1];
			else
				return nums[0];
		}
		if(nums[0]<=0){
			ok=false;
			keynum--;
			top++;
		}
		else if(nums[0]+nums[1]<=0&&len>1){
			ok=false;
			keynum-=2;
			top+=2;
		}
		if(nums[len-1]<=0){
			ok=false;
			keynum--;
			len--;
		}
		else if(nums[len-1]+nums[len-2]<=0&&len>1){
			ok=false;
			keynum-=2;
			len-=2;
		}
		
		if(!ok&&keynum>0){
			int []newnums=new int [keynum];
			for(int i=top,j=0;j<keynum;i++,j++) {
				newnums[j]=nums[i];
			}
			for(int c=0;c<keynum;c++)
			System.out.print(newnums[c]+" ");
			System.out.println();
			max=maxSubArray(newnums);
		}
		else{
			for(int i:nums){
				max+=i;
			}
			//return max;
		}
		return max;
	}

}
