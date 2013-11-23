package leetcode;

public class TrappingRainWater {
	public static int trap(int[] A) {
		int result = 0;
		int len = A.length;
		if (len <= 2) {
			return 0;
		}
		int maxleft[] = new int[len];
		int maxright[] = new int[len];
		for (int i = 1; i < len; i++) {
			maxleft[i] = Math.max(maxleft[i - 1], A[i - 1]);
			maxright[len - i - 1] = Math.max(maxright[len - i], A[len - i]);
		}
		for (int i = 1; i < len; i++) {
			int height = Math.min(maxleft[i], maxright[i]);
			if (height > A[i]) {
				result += height - A[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(num));
	}

}
