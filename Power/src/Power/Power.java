package Power;

import java.util.HashMap;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = myPow(2.00000, -2147483648);
		System.out.println(n);
	}

	private static double myPow(double x, int n) {
		HashMap<Integer, Double> cache = new HashMap<Integer, Double>();
 		cache.put(0, 1.0);
		if(x==0)
			return 0;
		if(x==1)
			return 1;
		if(n < 0)
			return 1/findPower(x, -n, cache);
		return findPower(x, n, cache);
		
	}

	private static double findPower(double x, int n, HashMap<Integer, Double>cache) {
		if(n==0)
			return 1;
		if(n==1) {
			cache.put(1, x);
			return cache.get(1);
		}
		
		if(cache.containsKey(n))
			return cache.get(n);
		if(n%2==0)
			cache.put(n, findPower(x, n/2, cache) * findPower(x, n/2, cache));
		else 
			cache.put(n, x*findPower(x, (n-1)/2, cache) * findPower(x, (n-1)/2, cache));
		return cache.get(n);
	}
}
