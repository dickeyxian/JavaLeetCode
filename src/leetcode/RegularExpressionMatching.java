package leetcode;

public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		int slen = s.length();
		int plen = p.length();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=p.charAt(i)&&p.charAt(i)!='.'&&p.charAt(i)!='*'){
				return false;
			}else if(p.charAt(i)=='.'){
				i++;
			}else if(p.charAt(i)=='*'){
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s="asdf";
		s.matches("*");
	}

}
