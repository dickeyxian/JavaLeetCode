package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			hm.put(numbers[i], i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			int b = target - numbers[i];
			if (hm.containsKey(b)) {
				result[0] = i + 1;
				result[1] = hm.get(b);
				break;
			}

		}
		return result;
	}

	public static int[] twoSum2(int[] numbers, int target) {
		int result[] = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int numbers[] = { 2, 1, 9, 4, 4, 56, 90, 3 };
		twoSum2(numbers, 8);
		System.out.println(twoSum2(numbers, 8)[0]);
		System.out.println(twoSum2(numbers, 8)[1]);
	}

}
