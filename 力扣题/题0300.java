package 力扣题;

import java.util.TreeSet;

public class 题0300 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] nums = { 4, 10, 4, 3, 8, 9 };
//		int [] nums= {10,9,2,5,3,7,101,18};
		int[] nums = { 10, 9, 2, 5, 3, 4 };
		题0300 test = new 题0300();
		System.out.println(test.lengthOfLIS(nums));

	}

//	public int lengthOfLIS(int[] nums) {
//		int max_len=1;
//		int now_len=1;
//		if(nums.length==0) {
//			return 0;
//		}
//		for(int k=0;k<nums.length;k++) {
//			now_len=1;
//			for(int i=k;i<nums.length-1;i++) {
//				for(int j=i+1;j<nums.length;j++) {
//					if(nums[i]<nums[j]) {
//						now_len++;
//						i=j-1;
//						break;
//					}
//					
//				}
//				if(now_len>max_len) {
//					max_len=now_len;
//				}
//				
//			}						
//		}
//		return max_len;
//	}
//}
//	public int lengthOfLIS(int[] nums) {
//		if (nums.length == 0) {
//			return 0;
//		}
//		int max_len = 1;
//		int now_len = 1;
//		int max_lastnum;
//		for (int i = 0; i < nums.length; i++) {
//			now_len = 1;
//			max_lastnum = nums[i];
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[j] > max_lastnum) {
//					max_lastnum = nums[j];
//					now_len++;
//				}
//			}
//			if (now_len > max_len) {
//				max_len = now_len;
//			}
//		}
//
//		return max_len;
//	}
	//利用更简单的API TreeSet的Ceiling方法，应该是logN？？但是最坏情况下会退化的把
	//TreeSet.ceiling(x)方法可以直接找出set中大于x的最小数字，如果不存在则返回null。
	//1、如果这个数字存在，则删除这个数字，然后把x插入set中，相当于代替该数字。
	//2、如果这个数字不存在，说明x大于set中任何数字，直接把x插入set中。
	//最后返回set的大小即可。

	public int lengthOfLIS(int[] nums) {
	    TreeSet<Integer> set = new TreeSet<>();
	    for (int i = 0; i < nums.length; i++) {
	        Integer c = set.ceiling(nums[i]);
	        //如果set中没有大于nums[i]的最小数字，那么就符合最长上升子序列，加入
	        //如果有，把让那个移除那个数字，换做这个nums[i]，因为nums[i]更小
	        //其实这边先判断 c!=null代码会更为简洁一点
	        if (c == null) {
	            set.add(nums[i]);
	        } else {
	            set.remove(c);
	            set.add(nums[i]);
	        }
	    }
	    return set.size();
	}

}