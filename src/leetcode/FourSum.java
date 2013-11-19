package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
	public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		int n = num.length;
		Arrays.sort(num);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int k = j + 1;
				int l = n - 1;
				while (k < l) {
					int sum = num[i]+num[j]+num[k]+num[l];
					if(sum>target){
						l--;
					}else if(sum<target){
						k++;
					}else{
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[k]);
						temp.add(num[l]);
						if(!set.contains(temp)){
							set.add(temp);
							result.add(temp);
						}
						k++;
						l--;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int num[]={1, 0, -1, 0, -2, 2};
		System.out.println(fourSum(num, 0));
	}

}
