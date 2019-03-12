package LargeGroups;

import java.util.ArrayList;
import java.util.List;

public class LargeGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		System.out.println(findLargeGroups(str));
	}

	private static List<List<Integer>>  findLargeGroups(String S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int n = S.length();
		int slow=0, fast=0;
		boolean isSame = false;
		for(int i=1; i<n; i++) {
			if(S.charAt(i) != S.charAt(i-1)) {
				fast = i;
				if(fast-slow >=3) {
					List<Integer> pair = new ArrayList<Integer>();
					pair.add(slow);
					pair.add(fast-1);
					res.add(pair);
				}
				slow = i;
				isSame = false;
			} else {
				isSame = true;
			}
		}
		if(isSame && n-slow >= 3) {
			List<Integer> pair = new ArrayList<Integer>();
			pair.add(slow);
			pair.add(n-1);
			res.add(pair);
		}
		return res;
	}

}
