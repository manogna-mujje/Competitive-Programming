import java.util.Hashtable;
import java.util.Set;
public class PalindromePermutation {
	public boolean isPalindromePermutation(String str) {
		int len = str.length();
		int hashMax, value = 1; 
		boolean flag = false;
		
		/**
		 * Decide the length of Hash table based on the length of given string
		 */
		// If string is of odd length
		if(len % 2 != 0) { 
			hashMax = ((len-1)/2 + 1);
		} else {
			hashMax = (len/2);
		}
		
		System.out.println(hashMax);
		/**
		 * Traverse through the given string and assign the values to Hash table
		 */
		
		Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
		
		for(int i=0; i < len; i++) {
			if(h.containsKey(str.charAt(i))) {
				h.put(str.charAt(i), h.get(str.charAt(i))+1);
				System.out.println("Inserted again");
			} else {
				h.put(str.charAt(i), value);
				System.out.println("Inserted");
			}
		}
		
		/**
		 * Return if the Hash table size exceeds the expected size 
		 */
		System.out.println(h.size());
		if(h.size() > hashMax) {
			System.out.println("Size exceeded");
			return false;
		}
		
		/**
		 * Traverse through the Hash table to check the count of repeated letters
		 */
		Set<Character> keys = h.keySet();
		for(char key:keys) {
			if(h.get(key) % 2 == 1 && !flag) {
				flag = true;
			} else if (h.get(key) % 2 == 0) {
				continue;
			} else {
				return false;
			}
		}
		
		System.out.println(h);
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePermutation p = new PalindromePermutation();
		System.out.println("Your answer is "+p.isPalindromePermutation("kkddmm"));
	}

}
