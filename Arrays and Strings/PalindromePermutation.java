public class PalindromePermutation {
	public boolean isPalindromePermutation(String s) {
		if(s == null || s.isEmpty()) return false;
		
		// even char count chars except at most one odd count
		// find char count
		int[] letters = new int[26];
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			// ignore spaces
			if(s.charAt(i) != ' ') {
				int val = s.charAt(i) - 'a';
				letters[val]++;
			}
		}
		
		int oddCount = 0;
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] % 2 == 1)
				oddCount++;
			if(oddCount > 1)
				break;
		}
		
		return (oddCount > 1) ? false : true;
	}
}
