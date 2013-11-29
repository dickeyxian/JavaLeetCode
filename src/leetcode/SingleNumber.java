package leetcode;

public class SingleNumber {
	public static int singleNumber(int[] A) {
		int result = A[0];
		for(int i=1;i<A.length;i++){
			result=result^A[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int A[]={1,1,3,2,3};
		System.out.println(singleNumber(A));
	}

}
