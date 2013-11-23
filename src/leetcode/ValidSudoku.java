package leetcode;

public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			boolean[] used = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if(!check(board[i][j], used)){
					return false;
				}
			}
			used = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if(!check(board[j][i], used)){
					return false;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				boolean[] used = new boolean[9];
				for (int k = 3 * i; k < 3 * i + 3; k++) {
					for (int c = 3 * j; c < 3 * j + 3; c++) {
						if(!check(board[k][c], used)){
							return false;
						}
					}
				}

			}
		}
		return true;
	}

	public static boolean check(char c, boolean[] used) {
		if (c == '.') {
			return true;
		}
		if (used[c - '1']) {
			return false;
		}
		used[c - '1'] = true;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] d = { "..4...63.", ".........", "4......9.", "...86....",
				"6.3.....1", "...7.....", "...5.....", ".........", "........." };
		char[][] board = new char[d.length][d.length];
		for (int i = 0; i < d.length; i++) {
			board[i] = d[i].toCharArray();
		}

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println(isValidSudoku(board));
	}

}
