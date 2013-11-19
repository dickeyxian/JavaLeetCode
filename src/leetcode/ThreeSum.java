package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		Arrays.sort(num);
		int n = num.length;
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int k = n - 1;
			if (i > 0 && num[i - 1] == num[i]) {
				continue;
			}
			while (j < k) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				int sum = num[i] + num[j] + num[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					temp.add(num[i]);
					temp.add(num[j]);
					temp.add(num[k]);
					result.add(temp);
					while (j < k && num[j + 1] == num[j]) {
						j++;
					}
					while (j < k && num[k - 1] == num[k]) {
						k--;
					}
					j++;
					k--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int num[] = { -1, 0, 1, 2, -1, -4 };
		int num2[] = { 0, 0, 0, 0 };
		System.out.println(threeSum(num2));

	}
}
