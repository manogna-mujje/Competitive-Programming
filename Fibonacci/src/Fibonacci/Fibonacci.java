package Fibonacci;

/*
 * Using Recursion with memoization
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int[] memo = new int[n+1];
		System.out.println(fib(n, memo));
	}

	private static int fib(int n, int[] memo) {
		// TODO Auto-generated method stub
		if(n<=2) {
			return 1;
		}
		if(memo[n] > 0) {
			return memo[n];
		}
		memo[n] = fib(n-1, memo)+fib(n-2, memo);
		return memo[n];
	}

}
