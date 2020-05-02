package 力扣题;

import java.util.Arrays;

public class 题面试10_01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
    public void merge(int[] A, int m, int[] B, int n) {
    	for(int i=0;i<n;i++) {
    		A[i+m]=B[i];
    	}
    	Arrays.sort(A);
    	
    }

}
