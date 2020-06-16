/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

 * @author tewodroswolde
 *
 */
public class Fibonacci {
	/*
	 * Time complexity: O(2^n)
	 * Space complexity: O(2^n)
	 */
	public static int fib1(int n) {
		if(n <= 1)
			return n;
		return fib1(n-1) + fib1(n-2);
	}
	
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 */
	public static int fib2(int n) {
		return fib2(n, new int[n+1]);
	}
	
	private static int fib2(int n, int[] memo) {
		if(n <= 1)
			return n;
		if(memo[n] == 0)
			memo[n] = fib2(n-1,memo) + fib2(n-2,memo);
		return memo[n];
	}

	/*
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 */
	public static int fib3(int n) {
		if(n <= 1)
			return n;
		int[] memo = new int[n];
		memo[0] = 0;
		memo[1] = 1;
		for(int i = 2; i < n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		
		return memo[n-1] + memo[n-2];
	}
	
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	public static int fib4(int n) {
		if(n == 0)
			return 0;
		int a = 0, b = 1;
		for(int i = 2; i < n; i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		return a+b;
	}
}
