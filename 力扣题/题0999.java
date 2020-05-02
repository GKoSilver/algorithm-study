package 力扣题;

public class 题0999 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0999 test = new 题0999();
		char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', 'p', '.', 'p', '.' },
				{ '.', 'p', '.', '.', '.', '.', '.', '.' }, { '.', 'p', 'B', '.', 'R', '.', 'B', 'p' },
				{ '.', 'p', '.', '.', '.', 'B', '.', '.' }, { '.', '.', 'p', '.', '.', 'p', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } };
		System.out.println(test.numRookCaptures(board));

	}

	public int numRookCaptures(char[][] board) {
		boolean flag = false;
		int index_x = 0, index_y = 0;
		int eat = 0;
		for (int i = 0; i < board.length && !flag; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'R') {
					index_x = i;
					index_y = j;
					flag = true;
					break;
				}
			}
		}
		for (int i = index_x; i >= 0; i--) {
			if (board[i][index_y] == 'p') {
				eat++;
				break;
			} else if (board[i][index_y] == 'B') {
				break;
			}
		}
		for (int i = index_x; i < board.length; i++) {
			if (board[i][index_y] == 'p') {
				eat++;
				break;
			} else if (board[i][index_y] == 'B') {
				break;
			}
		}
		for (int i = index_y; i >= 0; i--) {
			if (board[index_x][i] == 'p') {
				eat++;
				break;
			} else if (board[index_x][i] == 'B') {
				break;
			}
		}
		for (int i = index_y; i < board[0].length; i++) {
			if (board[index_x][i] == 'p') {
				eat++;
				break;
			} else if (board[index_x][i] == 'B') {
				break;
			}
		}
		return eat;

	}

}
