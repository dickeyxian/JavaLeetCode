package leetcode;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs[0].length(); i++) {
			for (int k = 1; k < strs.length; k++) {
				if (i > strs[k].length() - 1) {
					return strs[0].substring(0, strs[k].length());
				} else if (strs[k].charAt(i) != strs[0].charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}

	public static void main(String[] args) {
		String strs[] = { "abcd", "abdd", "abcdefg", "abcdefg", "abcdefg" };
		// strs[0].subSequence(0,2);
		// System.out.println(strs[0]);
		System.out.println(longestCommonPrefix(strs));
	}

}
