package 力扣题;

import java.util.Arrays;

public class 题面试40_00 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
    public int[] getLeastNumbers(int[] arr, int k) {
    	int [] min_arr=new int[k];
    	Arrays.sort(arr);
    	for(int i=0;i<k;i++) {
    		min_arr[i]=arr[i];
    	}
		return min_arr;

    }

}
