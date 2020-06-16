public class TripleStep {
    /*
	 * Brute Force approach
	 * time - O(3^n)
	 * space - O(3^n)
	 */
	public static int countWays(int n) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else 
			return countWays(n-1) + countWays(n-2) + countWays(n-3);
	}	
	
	/*
	 * Top-down approach
	 * time - O(n)
	 * space - O(n)
	 */
	public static int countWaysDP(int n) {
		int[] memo = new int[n+1];
		return countWaysDP(n,memo);
	}

	private static int countWaysDP(int n, int[] memo) {
		if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        } else if(memo[n] > 0) {
			return memo[n];
		} else {
			memo[n] = countWaysDP(n-1,memo) + countWaysDP(n-2,memo) + countWaysDP(n-3,memo);
			return memo[n];
		}
	}

	/*
	 * Bottom-up approach
	 * time - O(n)
	 * space - O(n)
	 */
	public static int countWaysDP2(int n) {
		if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
		int[] memo = new int[n+1];
		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 2;
		for(int i = 3; i <= n; i++) {
			memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
		}
		return memo[n];
	}
	
	/*
	 * Final approach
	 * time - O(n)
	 * space - O(1)
	 */
	public static int countWaysDP3(int n) {
		if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
		int a = 1, b = 1, c = 2;
		for(int i = 3; i <= n; i++) {
			int d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return c;
	}
}