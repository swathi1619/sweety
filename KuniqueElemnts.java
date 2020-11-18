package advjava;

import java.util.HashMap;
import java.util.Map.Entry;

public class KuniqueElemnts {
	public static String maxSubStringKUniqueChars(String s, int k) {
		int maxLen = 0;
		String maxSubstring = null;
		int m = 0;
		// declare a map to track the right most position of the two characters
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// if map contains 2 characters, process
			if (map.size() == k && !map.containsKey(c)) {
				if (i - m > maxLen) {
					maxLen = i - m;
					maxSubstring = s.substring(m, i);
					}
				int leftMost = s.length();
				for (Entry<Character, Integer> entry : map.entrySet()) {
					if (entry.getValue() < leftMost) {
						leftMost = entry.getValue();
						}
					}
				m = leftMost + 1;
				map.remove(s.charAt(leftMost));
				}
			map.put(c, i);
			}
		if (map.size() == k && maxLen == 0) {
			return s;
			}
		return maxSubstring;
		}
			
		}
	


