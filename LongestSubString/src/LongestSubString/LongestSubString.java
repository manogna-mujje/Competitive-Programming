package LongestSubString;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String input = "abccd";
		System.out.println(findLong(input));
	}

	private static int findLong(String str) {
		HashSet<Character> hm = new HashSet<Character>();
		int n = str.length();
		int start = 0, end, max=0;
		for(int i=0; i<n; i++) {
			if(!hm.contains(str.charAt(i))) {
				hm.add(str.charAt(i));
				end = i;
			} else {
				end = i;
				start++;
				max = Math.max(end-start+1, max);
			}
			max = Math.max(end-start+1, max);
		}
		return max;
	}

}
