public class OneEditAway {
	public boolean oneEditAway(String s, String t) {
		if(Math.abs(s.length() - t.length()) > 1) 
			return false;
		
		// matching length - check for replace
		if(s.length() == t.length()) {
			boolean flag = false;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != t.charAt(i)) {
					if(flag)
						return false;
					flag = true;
				}
			}
		} else {	// length differ by 1
			int i1 = 0, i2 = 0;
			while(i1 < s.length() && i2 < t.length()) {
				if(s.charAt(i1) != t.charAt(i2)) {
					if(i1 != i2)
						return false;
					i2++;
				} else {
					i1++;
					i2++;
				}
			}
		}
		
		return true;

	}
}
