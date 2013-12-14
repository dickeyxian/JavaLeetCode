package crackinterview;

public class RemoveADoubleB {
	public static String hkStringRemoveADoubleB(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'A' && str.charAt(i) != 'B') {
				sb.append(str.charAt(i));
			} else if (str.charAt(i) == 'B') {
				sb.append("BB");
			}
		}
		return sb.toString();
	}

	public static String hkStringRemoveADoubleB2(String str) {
		char ch[] = str.toCharArray();
		int j = 0;
		int countb = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'B') {
				countb++;
			}
			if (ch[i] != 'A') {
				ch[j++] = ch[i];
			}
		}
		char result[] = new char[j + countb];
		int k = 0;
//		for (int i = 0; i < j; i++) {
//			System.out.println(ch[i]);
//		}
		for (int i = 0; i < j; i++) {
			if (ch[i] != 'B') {
				result[k++] = ch[i];
			} else {
				result[k++] = 'B';
				result[k++] = 'B';
			}
		}
		return new String(result);
	}

	public static void main(String[] args) {
	//	System.out.println(hkStringRemoveADoubleB2("CAABD"));
		System.out.println(hkStringRemoveADoubleB2("ACAABDB"));
		System.out.println(hkStringRemoveADoubleB2("BACAABDBA"));
		System.out.println(hkStringRemoveADoubleB2("ABCCCCCCCCCCCCCCC"));
	}

}
