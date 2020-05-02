package 力扣题;

public class test {

	public static void main(String[] args) {

		int target = 9;
		for (int i = 1; i < target; i++) {
			double n=(1-i*2+Math.sqrt(4*Math.pow(i, 2)-i*4+target*8+1))/2;
			String [] n_part=String.valueOf(n).split("\\.");
			if(n_part[1].equals("0")) {
				for(int j=0;j<Integer.valueOf(n_part[0]);j++) {
					System.out.print(j+i);
				}
			}
			System.out.println();
		}
	}


}
