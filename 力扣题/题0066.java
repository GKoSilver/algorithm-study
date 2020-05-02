package 力扣题;

public class 题0066 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0066 sixtysix=new 题0066();
		int []digits= {9,9,9,9,9,9,9,9,9,9};
		digits=sixtysix.plusOne(digits);
		for(int i=0;i<11;i++){
			System.out.print(digits[i]+" ");
		}
	}
	public int[] plusOne(int[] digits) {
		int len=digits.length;
		boolean up=false;
		digits[len-1]++;
		if(digits[len-1]!=10) {
			return digits;
		}
		else {
			digits[len-1]=0;
			up=true;
			for(int i=1;i<len;i++){
				digits[len-1-i]++;
				if(digits[len-1-i]==10) {
					digits[len-1-i]=0;
				}
				else {
					break;
				}
			}
		}
		if(digits[0]==0) {
			int []newdig=new int[len+1];
			newdig[0]=1;
			System.arraycopy(newdig,1,digits,0, len);

			return newdig;
		}
		return digits;
	}
}


