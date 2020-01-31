public class CompressString {
	// len compress < original len	
	public String compressBetter(String s) {
		// check for len first
		int compLen = getCompressLen(s);
		if(compLen >= s.length()) return s;
		StringBuilder sb = new StringBuilder(compLen);
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			count++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		
		return sb.toString();
	}
	
	private int getCompressLen(String s) {
		int len = 0, count = 0;
		for(int i = 0; i < s.length(); i++) {
			count++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				len += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		
		return len;
	}
	
	public String compress(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			count++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		
		return sb.length() < s.length() ? sb.toString() : s;
	}
}
