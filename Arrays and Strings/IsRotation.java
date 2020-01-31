public class IsRotation {
	public boolean isRotation(String s, String t) {
		if(s.length() != t.length())
			return false;
		String ss = s + s;
		return isSubstring(ss,t);
	}
	
	private boolean isSubstring(String s, String t) {
		return s.indexOf(t) >= 0;
	}
}
