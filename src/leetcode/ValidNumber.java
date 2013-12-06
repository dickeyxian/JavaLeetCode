package leetcode;

public class ValidNumber {
	public static boolean isNumber(String s) {
		if(s.trim().length() == 0){
			return false;
		}
		String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
		if(s.trim().matches(regex)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1="123";
		String s2 = "+12";
		String s3 = " +12";
		String s4 = ".1";
		String s5 = "0e";
		String s6 = "  2+10  ";
		System.out.println(isNumber(s1));
		System.out.println(isNumber(s2));
		System.out.println(isNumber(s3));
		System.out.println(isNumber(s4));
		System.out.println(isNumber(s5));
		System.out.println(isNumber(s6));
	}

}
