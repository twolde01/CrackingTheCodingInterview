public class Permutation {
	public boolean isPermute(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		return sort(s).equals(sort(t));
	}
	
	private String sort(String s) {
		char[] arr = s.toCharArray();
		java.util.Arrays.sort(arr);
		
		return new String(arr);
	}

	public boolean isPermute2(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		// Assume ASCII characters of size 128
		int[] arr = new int[128];
		char[] s_arr = s.toCharArray();
		for(char c : s_arr) {
			arr[c]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			int val = (int)t.charAt(i);
			if(arr[val]-- < 0)
				return false;
		}
		
		return true;
	}
}
