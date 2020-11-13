package chit;

import java.util.Stack;

public class Method{
	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = s.length();
		if (len < 2)return true;
		Stack<Character> stack = new Stack<Character>();
		int index = 0;
		while (index < len / 2) {
			stack.push(s.charAt(index));
			index++;
			}
		if (len % 2 == 1)index++;
		while (index < len) {
			if (stack.empty())
				return false;
			char temp = stack.pop();
			if (s.charAt(index) != temp)
				return false;
			index++;
			}
		return true;
		}
}

