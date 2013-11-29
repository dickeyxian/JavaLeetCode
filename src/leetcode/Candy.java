package leetcode;

public class Candy {
	public static int candy(int[] ratings) {
		int n = ratings.length;
		if (n == 1) {
			return 1;
		}
		int result[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			result[i] = 1;
//		}
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				result[i] = result[i - 1] + 1;
			} else {
				result[i] = 1;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			if (ratings[i - 1] > ratings[i]) {
				result[i - 1] = Math.max(result[i - 1], result[i] + 1);
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += result[i];
		}
		return res;

	}

	public static void main(String[] args) {
		int ratings[] = { 1, 2, 2, 2, 1 };
		System.out.println(candy(ratings));
	}

}
