package 力扣题;

public class 题0007 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0007 seven=new 题0007();
		System.out.println(seven.reverse(1234567889));

	}
	public int reverse(int x) {
		try {
			if(x>=0){
				String xx=Integer.toString(x);  
				String xxx = new StringBuffer(xx).reverse().toString();
				//x=Integer.parseInt(xxx);
				x=Integer.valueOf(xxx).intValue();
				return x;    
			}
			else {
				int fx=0-x;
				String xx=Integer.toString(fx);  
				String xxx = new StringBuffer(xx).reverse().toString();
				fx=Integer.parseInt(xxx);
				int ffx=0-fx;
				return ffx;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
//		else if(x<Integer.MIN_VALUE)
//			return 0;
		

	}

}
