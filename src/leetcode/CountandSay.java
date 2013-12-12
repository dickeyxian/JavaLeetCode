package leetcode;

public class CountandSay {
	public static String countAndSay(int n) {
		if (n == 0) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		StringBuffer sb = new StringBuffer("1");
	
		for (int i = 2; i <= n; i++) {
			StringBuffer result = new StringBuffer();
			for (int j = 0; j < sb.length(); j++) {
				int count = 1;
				while (j < sb.length()-1 && sb.charAt(j + 1) == sb.charAt(j)) {
					count++;
					j++;
				}
				result.append(count);
				result.append(sb.charAt(j));
			}
			sb = result;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; ++i) {
			System.out.println(countAndSay(6));
		}
	}

}
