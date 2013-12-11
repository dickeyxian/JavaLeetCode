package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	public static ArrayList<String> anagrams(String[] strs) {
		ArrayList<String> result = new ArrayList<String>();
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String s : strs) {
			char c[] = s.toCharArray();
			Arrays.sort(c);
			String str = new String(c);
			if (map.containsKey(str)) {
				map.get(str).add(s);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(s);
				map.put(str, list);
			}
		}
		for (ArrayList<String> l : map.values()) {
			if (l.size() > 1) {
				result.addAll(l);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] strs = {"abcd","dbca","adcb","asdf"};
		System.out.println(anagrams(strs));
	}

}
