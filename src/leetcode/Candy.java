package leetcode;

public class Candy {
	public static int candy(int[] ratings) {
		int n = ratings.length;
		if (n == 1) {
			return 1;
		}
		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = 1;
		}
		for (int i = 0; i < n - 1; i++) {
			if (ratings[i + 1] > ratings[i]) {
				result[i + 1] = result[i] + 1;
			}
			if (ratings[i + 1] < ratings[i]) {
				if (result[i] <= result[i + 1]) {
					result[i] += 1;
				}
			}
		}
		int a = 0;
		for (int i = 0; i < n; i++) {
			a += result[i];
		}
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = 1;
		}
		for (int i = n - 1; i > 0; i--) {
			if (ratings[i] > ratings[i - 1]) {
				if (res[i] <= res[i - 1]) {
					res[i] += 1;
				}
			}
			if (ratings[i] < ratings[i - 1]) {
				res[i - 1] = res[i] + 1;
			}
		}
		int b = 0;
		for (int i = 0; i < n; i++) {
			b += res[i];
		}
		if (a > b) {
			return a;
		}
		return b;
	}

	public static void main(String[] args) {
		int ratings[] = { 1 ,2, 2, 2, 1 };
		System.out.println(candy(ratings));
	}

}
