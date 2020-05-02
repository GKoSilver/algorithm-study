package 力扣题;

public class 题0892 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0892 test=new 题0892();
		int[][] grid= {{2,2,2},{2,1,2},{2,2,2}};
		System.out.println(test.surfaceArea(grid));
	}
    public int surfaceArea(int[][] grid) {
    	int side=0;
    	int underside=0;
    	int block_num=0;
    	for(int i=0;i<grid.length;i++) {
    		for(int j=0;j<grid[0].length;j++) {
    			block_num+=grid[i][j];
    			if(grid[i][j]>0)
    			underside+=(grid[i][j]-1)*2;
    			try {
					side+=Math.min(grid[i][j], grid[i-1][j]);
				} catch (Exception e) {
					// TODO: handle exception
				}
    			try {
					side+=Math.min(grid[i][j], grid[i+1][j]);
				} catch (Exception e) {
					// TODO: handle exception
				}
    			try {
					side+=Math.min(grid[i][j], grid[i][j-1]);
				} catch (Exception e) {
					// TODO: handle exception
				}
    			try {
					side+=Math.min(grid[i][j], grid[i][j+1]);
				} catch (Exception e) {
					// TODO: handle exception
				}
    		}
    	}
		return block_num*6-side-underside;

    }

}
