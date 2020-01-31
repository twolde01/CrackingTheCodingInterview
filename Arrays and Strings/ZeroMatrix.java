public class ZeroMatrix {
	public void setZeroes(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		
		// check if first row has zeroes
		for(int c = 0; c < matrix[0].length; c++) {
			if(matrix[0][c] == 0) {
				rowHasZero = true;
				break;
			}
		}
		
		// check if first column has zeroes
		for(int r = 0; r < matrix.length; r++) {
			if(matrix[r][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		
		// mark first row/col for zeroes
		for(int r = 1; r < matrix.length; r++) {
			for(int c = 1; c < matrix[0].length; c++) {
				if(matrix[r][c] == 0) {
					matrix[r][0] = 0;
					matrix[0][c] = 0;
				}
			}
		}
		
		// use the marked row/col to nullify the matrix
		for(int r = 1; r < matrix.length; r++) {
			for(int c = 1; c < matrix[0].length; c++) {
				if(matrix[r][0] == 0 || matrix[0][c] == 0) {
					matrix[r][c] = 0;
				}
			}
		}
		
		// nullify the first row
        if(colHasZero) {
            for(int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
		}       
		
		// nullify the first col
        if(rowHasZero) {
            for(int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }
	}
	
	public void setZeroes2(int[][] grid) {
        int M = grid.length;
        int N = grid[0].length;

        // Loop through 2-d grid to figure out which rows & columns have a 0
        boolean[] rows = new boolean[M];
        boolean[] cols = new boolean[N];
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                if (grid[row][col] == 0) {
                    rows[row] = true;
                    cols[col] = true;
                }
            }
        }

        // Re-loop through 2-d grid and set whichever entries are necessary to 0
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                if (rows[row] == true || cols[col] == true) {
                    grid[row][col] = 0;
                }
            }
        }
	}
}
