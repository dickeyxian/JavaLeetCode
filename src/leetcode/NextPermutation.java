package leetcode;

public class NextPermutation {
	public static void nextPermutation(int[] num) {
		int n = num.length;
		if(num.length<=1){
			return;
		}
		int i, j;
		for (i = n - 2; i > 0; i--) {
			if (num[i + 1] > num[i]) {
				break;
			}
		}
		for (j = n - 1; j > i; j--) {
			if (num[j] > num[i]) {
				break;
			}
		}
		if(j==i){
			for (int begin = i, end = n - 1; begin < end; begin++, end--) {
				int t = num[begin];
				num[begin] = num[end];
				num[end] = t;
			}
		}else{
			int temp = num[j];
			num[j] = num[i];
			num[i] = temp;
			for (int begin = i + 1, end = n - 1; begin < end; begin++, end--) {
				int t = num[begin];
				num[begin] = num[end];
				num[end] = t;
			}

		}
		
	}

	public static void main(String[] args) {
		int num[] = { 4,4,5,3,3, 2, 1 };
		nextPermutation(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
