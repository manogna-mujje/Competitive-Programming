package TwoSum;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int [] arr = {1, 4, 6, 3, 8};
		int [] res = twoSum(arr, 10);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

	private static int[] twoSum(int[] arr, int k) {
		int[] res = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(!hm.containsKey(k-arr[i])) {
				hm.put(arr[i], i);
			} else {
				res[0] = hm.get(k-arr[i]);
				res[1] = i;
			}
		}
		return res;
	}

}
