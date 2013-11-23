package leetcode;

public class RotateImage {
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[j][n - i - 1] = temp[i][j];
			}
		}
	}

	public static void rotate2(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < (n + 1) / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
	}

	public static void rotate3(int[][] matrix) {// 首先沿着副对角线翻转一次，然后沿着水平中线翻转一次。
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				swap(matrix, i, j, n - j - 1, n - i - 1);
			}
		}
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				swap(matrix, i, j, n - i - 1, j);
			}
		}
	}

	public static void rotate4(int[][] matrix) {// 首先沿着水平中线翻转一次，然后沿着主对角线翻转一次。
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				swap(matrix, i, j, n - i - 1, j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				swap(matrix, i, j, j, i);
			}
		}

	}

	public static void swap(int[][] matrix, int i, int j, int k, int l) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[k][l];
		matrix[k][l] = temp;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate4(matrix);
		int n = matrix.length;
		// int a=100;
		// int b=120;
		// swap(a,b);
		// System.out.println(a+" "+b);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
