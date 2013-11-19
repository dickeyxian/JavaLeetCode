package crackinterview;

public class removeDuplicate {
	public static void removeDuplicates(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		boolean bool[] = new boolean[256];
		int j = 0;
		for (int i = 0; i < 256; i++) {
			bool[i] = false;
		}
		for (int i = 0; i < len; i++) {
			if (!bool[str[i]]) {
				bool[str[i]] = true;
				str[j++] = str[i];
			}
		}
		str[j] = 0;
	}

	public static void removeDuplicatesEff(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		int tail = 1;
		for (int i = 1; i < len; i++) {
			int j;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == tail) {
				str[tail++] = str[i];
			}
		}
		str[tail] = 0;
	}

	public static void main(String[] args) {
		String s = "aavvbcbhgggggd";
		char str[] = s.toCharArray();
		// removeDuplicates(str);
		removeDuplicatesEff(str);
		int i = 0;
		while (str[i] != 0) {
			System.out.print(str[i]);
			i++;
		}
	}

}
