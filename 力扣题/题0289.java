package 力扣题;

public class 题0289 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0289 test = new 题0289();
		int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		test.gameOfLife(board);
		System.out.println();
	}

	public void gameOfLife(int[][] board) {
		int[][] newBoard = new int[board.length][];
		for (int i = 0; i < board.length; i++) {
			newBoard[i] = board[i].clone();
		}
		int liveCell = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				try {

					if (board[i - 1][j - 1] == 1) {// 左上
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception

				}
				try {

					if (board[i - 1][j] == 1) {// 上
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i - 1][j + 1] == 1) {// 右上
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i][j + 1] == 1) {// 右
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i + 1][j + 1] == 1) {// 右下
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i + 1][j] == 1) {// 下
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i + 1][j - 1] == 1) {// 左下
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					if (board[i][j - 1] == 1) {// 左
						liveCell++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (board[i][j] == 1 && liveCell < 2) {
					newBoard[i][j] = 0;
				} else if (board[i][j] == 1 && liveCell > 3) {
					newBoard[i][j] = 0;
				} else if (board[i][j] == 0 && liveCell == 3) {
					newBoard[i][j] = 1;
				}
				liveCell = 0;
			}
		}
		for (int i = 0; i < newBoard.length; i++) {
			board[i] = newBoard[i].clone();
		}
//		board = newBoard;
//		for (int[] i : board) {
//			for (int j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	}

}
