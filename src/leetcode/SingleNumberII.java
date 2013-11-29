package leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class SingleNumberII {
	public static int singleNumber(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<A.length;i++){
			if(map.containsKey(A[i])){
				map.put(A[i], map.get(A[i])+1);
				if(map.get(A[i]) == 3){
					map.remove(A[i]);
				}
			}else{
				map.put(A[i], 1);
			}
		}
		Iterator<Integer> iterator = map.keySet().iterator();
		int result = 0;
		while(iterator.hasNext()){
			result = iterator.next();
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		int A[]={2,2,2,1,3,3,3};
		System.out.println(singleNumber(A));
	}

}
