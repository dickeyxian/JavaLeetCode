package leetcode;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		if (s.length() < 2) {
			return 0;
		}
		int maxlen = 0;
		int last = -1;// the position of the last ')'
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (!stack.isEmpty()) {
					stack.pop();
					if (stack.isEmpty()) {
						maxlen = Math.max(maxlen, i - last);
					} else {
						maxlen = Math.max(maxlen, i - stack.peek());
					}
				} else {
					last = i;
				}
			}

		}
		return maxlen;
	}

	public static int longestValidParentheses2(String s) {
		if (s.length() < 2) {
			return 0;
		}
		int maxlen = 0;
		int depth = 0;
		int start = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				depth++;
			} else {
				depth--;
				if (depth < 0) {
					start = i;
					depth = 0;
				} else if (depth == 0) {
					maxlen = Math.max(maxlen, i - start);
				}
			}
		}
		depth = 0;
		start = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ')') {
				depth++;
			} else {
				depth--;
				if (depth < 0) {
					start = i;
					depth = 0;
				} else if (depth == 0) {
					maxlen = Math.max(maxlen, start - i);
				}
			}
		}
		return maxlen;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses2("(()"));
		System.out.println(longestValidParentheses2("(()()"));
		System.out.println(longestValidParentheses2("()()(()"));
	}

}
