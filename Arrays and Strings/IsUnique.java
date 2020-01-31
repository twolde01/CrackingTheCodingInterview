public class IsUnique {
	public boolean isUniqueChars(String s) {
		// Assume ASCII character 
		// if length > 128 return false
		if(s == null || s.length() > 128) 
			return false;
		
		boolean[] buf = new boolean[128];
		for(int i = 0; i < s.length(); i++) {
			if(buf[s.charAt(i)])
				return false;
			buf[s.charAt(i)] = true;
		}
		
		return true;
	}
	
	public boolean isUniqueChars2(String s) {
		if(s.length() > 26) // assume only 26 alph characters
			return false;
		int checker = 0;
		for(int i = 0; i < s.length(); i++) {
			int val = (int) s.charAt(i);
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		
		return true;
	}
}
