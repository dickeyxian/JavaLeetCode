package leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] num) {
		HashSet<Integer> hash = new HashSet<Integer>();
		for (int i : num) {
			hash.add(i);
		}
		int ans = 0;
		for (int i : num) {
			int length = 1;
			int next = i+1;
			hash.remove(i);
			while(hash.contains(next)){
				hash.remove(next);
				next++;
				length++;
			}
			next = i-1;
			while(hash.contains(next)){
				hash.remove(next);
				next--;
				length++;
			}
			ans = Math.max(ans, length);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] num = {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(num));
	}

}
