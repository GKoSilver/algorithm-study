package 力扣题;

public class 题1013 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题1013 test=new 题1013();
		int[] A= {0,2,1,-6,6,-7,9,1,2,0,1};
		System.out.println(test.canThreePartsEqualSum(A));
		
	}
    public boolean canThreePartsEqualSum(int[] A) {
    	int sum=0;
    	for(int i:A) {
    		sum+=i;
    	}
    	if(sum%3!=0) {
    		return false;
    	}
    	int n=sum/3;
    	int A_sums=0;
    	int i=0;
    	for(;i<A.length-2;i++) {
    		A_sums+=A[i];
    		if(A_sums==n) {
    			break;
    		}
    	}
    	if(A_sums!=n) {
    		return false;
    	}
    	A_sums=0;
    	i++;
    	for(;i<A.length-1;i++) {
    		A_sums+=A[i];
    		if(A_sums==n) {
    			break;
    		}
    	}
    	if(A_sums!=n) {
    		return false;
    	}
    	A_sums=0;
    	i++;
    	for(;i<A.length;i++) {
    		A_sums+=A[i];
    		if(A_sums==n) {
    			break;
    		}
    	}
    	if(A_sums!=n) {
    		return false;
    	}else {
    		return true;
    	}
    }

}
