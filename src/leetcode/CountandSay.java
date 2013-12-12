package leetcode;

public class CountandSay {
	public static String countAndSay(int n) {
		if (n == 0) {
			return "";
		}
		StringBuffer sb = new StringBuffer("1");
		if (n == 1) {
			return "1";
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < sb.length(); j++) {
				
			}
		}
		return "";
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; ++i) {
			System.out.println(i);
		}
	}

}
