public class URLify { // %20'
	public void uRLify(char[] arr, int len) {
		int countSpace = 0;
		for(int i = 0; i < len; i++) {
			if(arr[i] == ' ')
				countSpace++;
		}
		
		int n = len + countSpace * 2;
		for(int i = len-1; i >= 0; i--) {
			if(arr[i] == ' ') {
				arr[n-1] = '0';
				arr[n-2] = '2';
				arr[n-3] = '%';
				n -= 3;
			} else {
				arr[n-1] = arr[i];
				n -= 1;
			}
		}
	}
}
