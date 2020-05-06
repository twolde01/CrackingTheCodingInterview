
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
		Arrays.fill(memo, -1);
		return helper(n,memo);
	}

	private static int helper(int n, int[] memo) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else if(memo[n] > -1)
			return memo[n];
		else {
			memo[n] = helper(n-1,memo) + helper(n-2,memo) + helper(n-3,memo);
			return memo[n];
		}
	}

	/*
	 * Bottom-up approach
	 * time - O(n)
	 * space - O(n)
	 */
	public static int countWaysDP2(int n) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else if(n == 1)
			return 1;
		else if(n == 2)
			return 2;
		else if(n == 3)
			return 3;
		int[] memo = new int[n+1];
		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 3;
		for(int i = 4; i <= n; i++) {
			memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
		}
		return memo[n];
	}
	
	/*
	 * Final approach
	 * time - O(1)
	 * space - O(1)
	 */
	public static int countWaysDP3(int n) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		int a = 1, b = 2, c = 3;
		for(int i = 4; i < n; i++) {
			int d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		
		return a + b + c;
	}

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9,10,15,20,25,30,35};
		for(int i : a) {
			long start = System.currentTimeMillis();
			System.out.print(i + ": " + countWaysDP(i));
			long end = System.currentTimeMillis();
			long time = end - start;
			System.out.println("  time: " + time);
		}
    }
}