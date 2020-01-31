import java.util.*;
/*
 * Given a string containing just the characters 
 * '(', ')', '{', '}', '[' and ']', determine if 
 * the input string is valid.
 */

public class IsValidd {
	public boolean isValid(String s) {
		if(s == null)
			return false;
		if(s.isEmpty())
			return true;
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				st.push(c);
			} else if(map.values().contains(c)){
				if(!st.isEmpty() && map.get(st.peek()) == c) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		
		return st.isEmpty();
		
	}
}
