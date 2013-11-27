package leetcode;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int result = 0;
		int j = 0;
		int total = 0;
		for (int i = 0; i < gas.length; i++) {
			result += gas[i] - cost[i];// result = gas[i] - cost[i]
			total += gas[i] - cost[i];
			if (result < 0) {	//if(result<0 && total<0)
				j = i+1;
				result = 0;
			}
		}
		return total >= 0 ? j : -1;
	}

	public static void main(String[] args) {
		int gas[]={2,3,1};
		int cost[]={3,1,2};
		System.out.println(canCompleteCircuit(gas, cost));
	}

}
