package UniqueEmailAddresses;

import java.util.HashSet;

public class uniqueEmail {

	public static void main(String[] args) {
		String [] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int k = findUnique(input);
		System.out.println(k);
	}

	private static int findUnique(String[] input) {
		HashSet<String> li = new HashSet<String>();
		int n = input.length;
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder("");
			String email = helper(sb, input[i]);
			if(!li.contains(email)) {
				li.add(email);
			}
		}
		return li.size();
	}

	private static String helper(StringBuilder sb, String curr) {
		int j=0;
		boolean isPlusGone = false;
		while(curr.charAt(j) != '@') {
			if(curr.charAt(j) == '+') {
				isPlusGone = true;
			}
			if(!isPlusGone  && curr.charAt(j) != '.') {
				sb.append(curr.charAt(j));
			}
			j++;
		}
		StringBuilder sb1 = new StringBuilder(curr.substring(j+1));
		return sb.append(sb1).toString();
	}
}
