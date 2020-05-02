package 力扣题;

import java.math.BigInteger;

public class 题0365 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0365 test=new 题0365();
		int x=13;
		int y=11;
		int z=1;
		System.out.println(test.canMeasureWater(x, y, z));
	}
    public boolean canMeasureWater(int x, int y, int z) {
    	if (x + y < z) return false;
        if (x == 0 || y == 0) return z == 0 || x + y == z;
        return z % BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue() == 0;

    }

}
