package leetcode;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		if (s.length() < 2) {
			return false;
		}
		String left = "({[";
		String right = ")}]";
		Stack<Character> stack = new Stack<Character>();
		if(right.indexOf(s.charAt(0)) != -1){
			return false;
		}
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (stack.isEmpty() || right.indexOf(s.charAt(i)) == -1
					|| stack.peek() != left.charAt(right.indexOf(s.charAt(i)))) {
				stack.push(s.charAt(i));
			} else {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("[])"));
	}

}
