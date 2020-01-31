public class RotateMatrix {
	public void rotateMatrix(int[][] m) {
		// first transpose matrix
		// then reverse each row
		int n = m.length;
		
		// transpose matrix
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
		
		// reverse each row
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				int temp = m[i][j];
				m[i][j] = m[i][n-j-1];
				m[i][n-j-1] = temp;
			}
		}
	}
	
	public void rotateMatrix2(int[][] m) {
		if(m.length == 0 || m.length != m[0].length)
			throw new IllegalArgumentException("Not a square matrix"); // Not a square
		
		// rotate layer by layer
		int n = m.length;
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = m[first][i];
				
				// left -> top
				m[first][i] = m[last-offset][first];
				
				// bottom -> left
				m[last-offset][first] = m[last][last-offset];
				
				// right -> bottom
				m[last][last-offset] = m[i][last];
				
				// top -> right
				m[i][last] = top;
			}
		}
	}
}
