package leetcode;

public class ReverseInteger {
	public static int reverse(int x) {
		boolean flag = true;
		if (x < 0) {
			flag = false;
			x = -x;
		}
		int c = 0;
		while (x != 0) {
			c = c * 10 + x % 10;
			x = x / 10;
		}
		if (!flag) {
			return -1 * c;
		}
		return c;
	}
	public static int reverse2(int x) {
		int c = 0;
		while (x != 0) {
			c = c * 10 + x % 10;
			x = x / 10;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse2(-123));
	}

}
