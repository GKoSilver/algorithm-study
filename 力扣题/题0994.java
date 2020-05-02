package 力扣题;

import java.util.ArrayList;

public class 题0994 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0994 test = new 题0994();
		int[][] grid = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
		System.out.println(test.orangesRotting(grid));
	}

	public int orangesRotting(int[][] grid) {
		int time = 0;
		int flash = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1)
					flash++;
			}
		}
        if(flash==0){
            return 0;
        }
		int max_time = 100;
//		int max_time = Math.max(grid.length, grid[0].length) * 2;
		while (true) {
			ArrayList<String> rooten = new ArrayList<String>();
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					if (grid[i][j] == 2) {
						rooten.add(i + "/" + j);
					}
				}
			}
			for (String rooten_index : rooten) {
				String[] num = rooten_index.split("/");
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				try {
					if (grid[a - 1][b] == 1) {
						flash--;
						grid[a - 1][b] = 2;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (grid[a + 1][b] == 1) {
						flash--;
						grid[a + 1][b] = 2;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (grid[a][b - 1] == 1) {
						flash--;
						grid[a][b - 1] = 2;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (grid[a][b + 1] == 1) {
						flash--;
						grid[a][b + 1] = 2;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			time++;
			if (flash == 0) {
				break;
			}
			if (time >= max_time) {
				return -1;
			}
		}
		return time;

	}

}
