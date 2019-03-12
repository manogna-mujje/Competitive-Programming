
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String [] strs = {"cat","bat","cow"};
		String ans = findCommonPrefix(strs);
		String res = findPrefixIterative(strs);
		System.out.println(res);
//		System.out.println(ans);
	}

	private static String findPrefixIterative(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		String key = strs[0];
		for(int i=1; i<strs.length; i++) {
			for(int j=0; j<key.length(); j++) {
				if(j== strs[i].length() || key.charAt(j) != strs[i].charAt(j)) {
					key = key.substring(0, j);
					break;
				}
			}
		}
		return key;
	}

	private static String findCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder(strs[0]);
		return helper(sb, strs, 1).toString();
	}

	private static StringBuilder helper(StringBuilder key, String[] strs, int k) {
		if(k == strs.length) return key;
		int keyLen = key.length();
		for(int i=0; i<keyLen; i++) {
			if(i==strs[k].length() || key.charAt(i) != strs[k].charAt(i)) {
				key.delete(i,keyLen);
				return helper(key, strs, k+1);
			}		
		}
		return helper(key, strs, k+1);
	}
	
	
}
