package 力扣题;

public class 题面试01_07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题面试01_07 test=new 题面试01_07();
		int[][] matrix= {	{1,2,3},
				  			{4,5,6},
				  			{7,8,9}};
		test.rotate(matrix);
	}
    public void rotate(int[][] matrix) {
    	int[][]new_matrix=new int[matrix.length][matrix[0].length];
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix.length;j++) {
    			new_matrix[j][matrix.length-i-1]=matrix[i][j];
    		}
    	}
//    	for(int []i:new_matrix) {
//    		for(int j:i) {
//    			System.out.print(j);
//    		}
//    		System.out.println();
//    	}
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix.length;j++) {
    			matrix[i][j]=new_matrix[i][j];
    		}
    	}
    	
    	for(int []i:matrix) {
    		for(int j:i) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    
    }

}
