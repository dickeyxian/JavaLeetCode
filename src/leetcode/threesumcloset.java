package leetcode;

import java.util.Arrays;

public class threesumcloset {
	public static int threeSumClosest(int[] num, int target) {
		int margin = Integer.MAX_VALUE;
		int n = num.length;
		Arrays.sort(num);
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && num[i - 1] == num[i]) {
				continue;
			}
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = num[i] + num[j] + num[k];
				if (Math.abs(sum - target) < margin) {
					margin = Math.abs(sum - target);
					result = sum;
				}
				if (sum > target) {
					k--;
				} else if(sum<target){
					j++;
				}else{
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int num[] = { 1, -3, 3, 5, 4, 1 };
	//	int num2[] = { 0, 2, 1, -3 };
		System.out.println(threeSumClosest(num, 1));
		// System.out.println(threeSumClosest(num2, 1));
	}

}
