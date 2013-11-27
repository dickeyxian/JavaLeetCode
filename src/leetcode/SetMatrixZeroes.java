package leetcode;


public class SetMatrixZeroes {
	public static void setZeroes(int[][] matrix) {//O(m+n) space
		int m = matrix.length;
		int n = matrix[0].length;
		int row[] = new int[m];
		int col[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			if (row[i] == 1) {
				for (int k = 0; k < n; k++) {
					matrix[i][k] = 0;
				}
			}
		}
		for (int j = 0; j < n; j++) {
			if (col[j] == 1) {
				for (int k = 0; k < m; k++) {
					matrix[k][j] = 0;
				}
			}
		}
	}

	public static void setZeroes2(int[][] matrix) {//O(1) space
		int m = matrix.length;
		int n = matrix[0].length;
		boolean row_has_zero = false;// 第一行是否存在 0
		boolean col_has_zero = false;// 第一列是否存在 0
		for (int i = 0; i < m; i++) {
			if (matrix[i][0] == 0) {
				col_has_zero = true;
				break;
			}
		}
		for (int j = 0; j < n; j++) {
			if (matrix[0][j] == 0) {
				row_has_zero = true;
				break;
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < m; i++) {
			if (matrix[i][0] == 0) {
				for (int k = 1; k < n; k++) {
					matrix[i][k] = 0;
				}
			}
		}
		for (int j = 1; j < n; j++) {
			if (matrix[0][j] == 0) {
				for (int k = 1; k < m; k++) {
					matrix[k][j] = 0;
				}
			}
		}
		if (row_has_zero) {
			for (int j = 0; j < n; j++) {
				matrix[0][j] = 0;
			}
		}
		if (col_has_zero) {
			for (int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 0, 5 }, { 4, 3, 1, 4 }, { 0, 1, 1, 4 },
				{ 1, 2, 1, 3 }, { 0, 0, 1, 1 } };
		setZeroes2(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
