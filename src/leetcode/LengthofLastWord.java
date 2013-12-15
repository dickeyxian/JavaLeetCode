package leetcode;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		if(s.length()==0){
			return 0;
		}
		int len = s.length();
		int count = 0;
		boolean flag = true;
		for(int i=len-1;i>=0;i--){
			if(Character.isLetter(s.charAt(i))){
				flag = false;
				count++;
			}else if(!flag){
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
