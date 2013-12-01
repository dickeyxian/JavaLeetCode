package leetcode;

public class ClimbingStairs {
	public static int climbStairs(int n) {//斐波那契数列
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int num[] = new int[n + 1];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		for (int i = 3; i <= n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		return num[n];
	}
	public static int climbStairs2(int n) {
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++){
			int temp=b;
			b=a+b;
			a=temp;
		}
		return b;
	}
	public static int climbStairs3(int n) {
		double s=Math.sqrt(5);
		return (int) Math.floor((Math.pow((1+s)/2,n+1)+Math.pow((1-s)/2,n+1))/s+0.5);
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println(climbStairs3(i));
		}
	}

}
