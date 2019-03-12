package ClimbingStairs;

public class ClimbStairs {

	public static void main(String[] args) {
		int n = ClimbingStairs(3);
		System.out.println(n);
	}

	private static int ClimbingStairs(int n) {
		int[] cache = new int[n+1];
		return ClimbingStairs(0, n, cache);
	}

	private static int ClimbingStairs(int i, int n, int[] cache) {
		if(i == n)
			return 1;
		if(i > n)
			return 0;
		if(cache[i] > 0)
			return cache[i];
		cache[i] = ClimbingStairs(i+1, n, cache) + ClimbingStairs(i+2, n, cache);
		return cache[i];
	}

}
