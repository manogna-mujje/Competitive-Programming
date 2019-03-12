package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumThreeSum {

	public static void main(String[] args) {
		int[] num = {-2,0,0,2,2};
		List<List<Integer>> li = threeSum(num);
		System.out.println(li);
	}

	public static List<List<Integer>> threeSum(int[] num) {
		int n= num.length;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(num == null || n == 0) return res;
		Arrays.sort(num);
		for(int i=0; i<n-2; i++) {
			if(i == 0 || i>0 && num[i] != num[i-1]) {
				int key = i;
				int lo = i+1;
				int hi = n-1;
				while(lo < hi) {
					if(num[key]+num[lo]+num[hi] == 0) {
						List<Integer> row = new ArrayList<Integer>();
						row.add(num[key]);
						row.add(num[lo]);
						row.add(num[hi]);
						if(res.indexOf(row) == -1)
							res.add(row);
						lo++;
						hi--;
					} else if(num[key]+num[lo]+num[hi] < 0) {
						lo++;
					} else {
						hi--;
					}
				}
			}
		}
		return res;
	}
}
